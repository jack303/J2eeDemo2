package com.hwadee.service;

import com.hwadee.model.PageInfo;
import com.hwadee.service.inter.WeiboService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by localdomain on 2017/3/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:spring-context.xml"})
public class WeiboServiceTest {
    @Autowired
    WeiboService weiboService;

    @Test
    public void testList()
    {
        PageInfo pageInfo = weiboService.list(1,1);
        System.out.print(pageInfo.toString());
    }
}
