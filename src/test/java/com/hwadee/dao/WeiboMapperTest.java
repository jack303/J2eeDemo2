package com.hwadee.dao;

import com.hwadee.model.WeiboDto;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by localdomain on 2017/3/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:spring-context.xml"})
public class WeiboMapperTest {
    @Autowired
    WeiboMapper weiboMapper;

    @Test
    public void testCount()
    {
        int count = weiboMapper.count(1);
        System.out.println(count);
    }

    @Test
    public void testList()
    {
        List<WeiboDto> list  = weiboMapper.list(1,0,5);
        System.out.println(list.toString());
    }



}
