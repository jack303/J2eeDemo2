package com.hwadee.service;

import com.hwadee.dao.AccountMapper;
import com.hwadee.service.inter.AccountService;
import com.hwadee.service.inter.WeiboService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by localdomain on 2017/3/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:spring-context.xml"})
public class BaseTest {
    @Autowired
    WeiboService weiboService;
    @Test
    public void testList()
    {
        weiboService.list(1,1);
    }
}
