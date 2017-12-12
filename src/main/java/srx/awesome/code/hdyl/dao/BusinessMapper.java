package srx.awesome.code.hdyl.dao;

import srx.awesome.code.hdyl.bean.Business;
import srx.awesome.code.hdyl.bean.Dic;

public interface BusinessMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Business record);

    int insertSelective(Business record);

    Business selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Business record);

    int updateByPrimaryKey(Business record);

    Dic getBusinessCity(Integer BusinessId);
}
