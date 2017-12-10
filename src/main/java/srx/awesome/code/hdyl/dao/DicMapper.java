package srx.awesome.code.hdyl.dao;

import srx.awesome.code.hdyl.bean.Dic;
import srx.awesome.code.hdyl.bean.DicKey;

public interface DicMapper {
    int deleteByPrimaryKey(DicKey key);

    int insert(Dic record);

    int insertSelective(Dic record);

    Dic selectByPrimaryKey(DicKey key);

    int updateByPrimaryKeySelective(Dic record);

    int updateByPrimaryKey(Dic record);
}