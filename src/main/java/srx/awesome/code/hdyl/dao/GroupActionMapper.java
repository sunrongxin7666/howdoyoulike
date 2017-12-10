package srx.awesome.code.hdyl.dao;

import srx.awesome.code.hdyl.bean.GroupAction;

public interface GroupActionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GroupAction record);

    int insertSelective(GroupAction record);

    GroupAction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GroupAction record);

    int updateByPrimaryKey(GroupAction record);
}