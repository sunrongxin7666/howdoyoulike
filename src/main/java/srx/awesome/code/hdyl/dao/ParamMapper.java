package srx.awesome.code.hdyl.dao;

import srx.awesome.code.hdyl.bean.Param;

public interface ParamMapper {
    int insert(Param record);

    int insertSelective(Param record);
}