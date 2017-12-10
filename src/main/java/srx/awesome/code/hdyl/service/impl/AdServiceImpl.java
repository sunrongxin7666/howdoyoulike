package srx.awesome.code.hdyl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import srx.awesome.code.hdyl.bean.Ad;
import srx.awesome.code.hdyl.dao.AdMapper;
import srx.awesome.code.hdyl.service.IAdService;

import java.util.List;

@Service("IAdService")
public class AdServiceImpl implements IAdService {
    @Autowired
    private AdMapper adMapper;
    public List<Ad> getAllAd() {
        return adMapper.selectList();
    }
}
