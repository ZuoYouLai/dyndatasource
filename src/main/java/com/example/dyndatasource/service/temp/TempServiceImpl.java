package com.example.dyndatasource.service.temp;

import com.example.dyndatasource.mapper.temp.TempMapper;
import com.example.dyndatasource.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("tempService")
public class TempServiceImpl implements TestService {


    @Resource
    private TempMapper tempMapper;


    @Override
    public List list() {
        return tempMapper.list();
    }

}
