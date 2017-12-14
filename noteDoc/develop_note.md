# SSM-大众点评
@(Java)[ssm, javaWeb]
![Alt text](./1510931485734.png)
![Alt text](./1510931565854.png)
![Alt text](./1510932218756.png)
![Alt text](./1510932559193.png)
![Alt text](./1510933097781.png)
![Alt text](./1510933124257.png)
![Alt text](./1510933194068.png)
![Alt text](./1510933273643.png)
![Alt text](./1510933309406.png)
 ![Alt text](./1510933379578.png)

Mybatis 
![Alt text](./1511796334196.png)


## 广告功能
### 上传文件
- Spring自带MultipartFile类 transferTo(File)，转存在文件中；
-   静态文件的路径要写入配置文件，而不是数据库中，这样好迁移![Alt text](./1512644904746.png)
- 配置资源的key-value都在Resources文件下的properties/xxx.properties中。在配置文件中加载`<context:property-placeholder location=“”>`;
- 多个配置文件如何加载？使用通配符，在总的配置文件中，导入全部的property文件，和其他的配置文件；
- 如何获取property文件中的内容，@{Value("${key}")}；
- 保存文件名，可以是使用时间戳/uuid等来处理同名的问题；
- 前端页面的输入校验是容易被绕过，还需要后端检验；

- BeanUtils.copyProperties() 在Bean之间拷贝属性


### JSP2.0自定义标签
![Alt text](./1512648273820.png)
- jsp同级的tag目录下
- 头`<%@ tag language="java" pageEncoding="UTF-8" %>`
- 设置标签属性
- 引用：`<%@ taglib prefix="name" tagdir="path">` `<name:filename 属性...>`


Bean中不要的属性可以位置为空，使用`@JsonInclude(Include.NON_NULL)`，就会被在Json中出现；

### 数据绑定
Bean的字段和参数名相同将会自动绑定,利用反射，知道Bean会有那些属性，和参数名相对应。但是如果是单衣的变量名，需要使用`@RequestParam("")`来告诉Spring要绑定那个参数（反射无法知道参数名）。

![Alt text](./1512650412829.png)


### jquery-validation.js 表单验证
先引用jquery，在引用它。
![Alt text](./1512820202337.png)
![Alt text](./1512820243095.png)
![Alt text](./1512820603852.png)
![验证规则和信息](./1512820626801.png)

还有自定义规则 addtional-rule
![添加自定义规则](./1512820800245.png)
![使用自定义规则](./1512820898029.png)

错误信息的提示：
![Alt text](./1512821113041.png)
![Alt text](./1512821208601.png)


## 商户模块
![数据库设计](./1512822057172.png)
![Alt text](./1512822841062.png)

### SpringMVC+RestFul
![Alt text](./1512823094096.png)

配置过滤器 处理hidden的空间方法
![Alt text](./1512823176946.png)

### 删除商户的接口
![Alt text](./1512823372363.png)
JSP
![Alt text](./1512823484076.png)
JS
![Alt text](./1512823512613.png)
这样POST—>Delete;

### 文件上传
![Alt text](./1512824886963.png)
但是RestFul直接上传Multipart文件有问题，无法解析put方法

流程
![Alt text](./1512825345071.png)
![Alt text](./1512825653292.png)
![Alt text](./1512825771138.png)

需要再添加一个过滤器
root-context.xml
![Alt text](./1513085808480.png)
在web.xml
![Alt text](./1513085857479.png)
![Alt text](./1513085872473.png)


### mybatis多对一和一对一

- 多对一是表中保存其他表的外键；
- 一对多是表中主键是别的表的外键；
- 一对一是一种特殊的多对一；

```
		<association property="cityDic" javaType="Dic">
			<result column="city_name" property="name"/>
		</association>
		<association property="categoryDic" javaType="Dic">
			<result column="category_name" property="name"/>
		</association>
	</resultMap>
```


```
	<select id="selectByPage" resultMap="BusinessResultMap">
		select b.id,b.img_file_name,b.title,b.subtitle,b.price
		,b.distance,b.number,b.`desc`,b.city,b.category,b.star_total_num,b.comment_total_num
		,d_city.name city_name,d_category.name category_name
		from
		business b
		left join dic d_city on b.city=d_city.code and
		d_city.type='${@org.imooc.constant.DicTypeConst@CITY}'
		left join dic d_category on
		b.category=d_category.code and d_category.type='${@org.imooc.constant.DicTypeConst@CATEGORY}'
		<where>
			<if test="title != null and title != ''">
				and b.title like '%' #{title} '%'
			</if>
			<if test="subtitle != null and subtitle != ''">
				and b.subtitle like '%' #{subtitle} '%'
			</if>
			<if test="desc != null and desc != ''">
				and b.`desc` like '%' #{desc} '%'
			</if>
			<if test="city != null and city != ''">
				and b.city = #{city}
			</if>
			<if test="category != null and category != ''">
				and b.category = #{category}
			</if>
		</where>
		order by id
	</select>
```
sql中列的别名要和result-column一致；
注意构造器模式不能使用联合查询
'${@org.imooc.constant.DicTypeConst@CATEGORY}' mybatis中使用java的常量和静态方法@Classname@fieldname/method

### 商户接口开发
 










 


