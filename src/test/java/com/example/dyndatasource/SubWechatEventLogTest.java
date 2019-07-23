package com.example.dyndatasource;

import com.example.dyndatasource.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @ Author     ：SamLai
 * @ Date       ：Created in 2019-07-19 18:04
 * @ Description：
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DyndatasourceApplication.class)
@Slf4j
@Transactional
public class SubWechatEventLogTest {


    @Autowired
    private TestService testService;

    @Test
    public void list() {
        List list = testService.list();
        System.out.println(list.toArray().toString());
    }


}
