package com.hwadee.controller;

import com.hwadee.entity.Weibo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by localdomain on 2017/3/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.hwadee.conf.SpringDependencyConfig.class)
public class WeiboDeployControllerTest {
    @Autowired
    WeiboDeployController deployController;

    @Test
    public void testDeployController()
    {
        Weibo weibo = new Weibo();
        weibo.setWid(1);
        deployController.getWeiboService().deployWeibo(weibo);
    }

}
