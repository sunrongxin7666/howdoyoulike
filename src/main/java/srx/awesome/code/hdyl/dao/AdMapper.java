package srx.awesome.code.hdyl.dao;

import srx.awesome.code.hdyl.bean.Ad;

public interface AdMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ad record);

    int insertSelective(Ad record);

    Ad selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ad record);

    int updateByPrimaryKey(Ad record);
}