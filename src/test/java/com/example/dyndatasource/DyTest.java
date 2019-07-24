package com.example.dyndatasource;

import com.example.dyndatasource.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ Author     ：SamLai
 * @ Date       ：Created in 2019-07-24 17:25
 * @ Description：
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DyndatasourceApplication.class)
@Slf4j
@Transactional
public class DyTest {


    @Autowired
    private TestService masterService;


    @Autowired
    private TestService tempService;


    @Test
    public void testA() {
        masterService.list();
    }



    @Test
    public void testB() {
        tempService.list();
    }

}
