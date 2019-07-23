package com.example.dyndatasource.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.dyndatasource.domain.SubCustomersExample;
import com.example.dyndatasource.mapper.SubCustomersMapper;
import com.example.dyndatasource.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@DS("temp")
@Service
public class TestServiceImpl implements TestService {


    @Autowired
    private SubCustomersMapper subCustomersMapper;


    @Override
    public List list() {
        return subCustomersMapper.selectByExample(new SubCustomersExample());
    }
}
