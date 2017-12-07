<%@ tag language="java" pageEncoding="UTF-8" %>
<%--标签属性 当前页面页码--%>
<%@ attribute type="org.imooc.bean.Page" name="page" required="true" %>
<%--传入的方法名用于翻页后传回页码--%>
<%@ attribute type="String" name="jsMethodName" required="true" %>
<%--js脚本--%>
<script type="text/javascript">
	<%--传回页码--%>
	function transCurrentPage(currentPage) {
		var rule = /^[0-9]*[1-9][0-9]*$/;
		if(!rule.test(currentPage)) {
			currentPage = 1;
		}
		eval("${jsMethodName}(currentPage)");
	}
</script>

<div class="page fix">
	<a href="javascript:transCurrentPage('1');" class="first">首页</a>
	<a href="javascript:transCurrentPage('${page.currentPage - 1}');" class="pre">上一页</a>
	当前第<span>${page.currentPage}/${page.totalPage}</span>页
	<a href="javascript:transCurrentPage('${page.currentPage + 1}');" class="next">下一页</a>
	<a href="javascript:transCurrentPage('${page.totalPage}');" class="last">末页</a>
	跳至 &nbsp;<input id="currentPageText" value="1" class="allInput w28" type="text"/>&nbsp;页 &nbsp;
	<a href="javascript:transCurrentPage($('#currentPageText').val());" class="go">GO</a>
</div>
