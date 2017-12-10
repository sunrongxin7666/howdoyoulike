package srx.awesome.code.hdyl.dao;

import srx.awesome.code.hdyl.bean.GroupMenu;

public interface GroupMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GroupMenu record);

    int insertSelective(GroupMenu record);

    GroupMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GroupMenu record);

    int updateByPrimaryKey(GroupMenu record);
}