package srx.awesome.code.hdyl.dao;

import srx.awesome.code.hdyl.bean.Action;

public interface ActionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Action record);

    int insertSelective(Action record);

    Action selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Action record);

    int updateByPrimaryKey(Action record);
}