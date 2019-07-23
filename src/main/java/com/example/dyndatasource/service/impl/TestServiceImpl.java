package com.example.dyndatasource.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.dyndatasource.domain.SubCustomersExample;
import com.example.dyndatasource.mapper.SubCustomersMapper;
import com.example.dyndatasource.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;



@DS("slave_1")
@Service
public class TestServiceImpl implements TestService {


    @Resource
    private SubCustomersMapper subCustomersMapper;


    @DS("slave_1")
    @Override
    public List list() {
        return subCustomersMapper.selectByExample(new SubCustomersExample());
    }
}
