package com.example.dyndatasource.service.master;

import com.example.dyndatasource.mapper.master.SubCustomersMapper;
import com.example.dyndatasource.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("masterService")
public class MasterServiceImpl implements TestService {


    @Resource
    private SubCustomersMapper subCustomersMapper;


    @Override
    public List list() {
        return subCustomersMapper.list();
    }


}
