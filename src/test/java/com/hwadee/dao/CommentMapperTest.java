package com.hwadee.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.*;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * Created by localdomain on 2017/3/8.
 */
public class CommentMapperTest {
    BaseMapperTest baseMapperTest;
    private SqlSession session = null;
    CommentMapper mapper;

    @Test
    public void deleteByPrimaryKey() throws Exception {
        int count = mapper.deleteByPrimaryKey(1);
        Assert.assertEquals(1, count);
    }

    @Test
    public void insert() throws Exception {

    }

    @Test
    public void insertSelective() throws Exception {

    }

    @Test
    public void selectByPrimaryKey() throws Exception {

    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {

    }

    @Test
    public void updateByPrimaryKey() throws Exception {

    }

    @Before
    public void before() throws IOException {
        baseMapperTest = new BaseMapperTest();
        session = baseMapperTest.getSqlSessionFactory().openSession();
        mapper = session.getMapper(CommentMapper.class);
    }


    @After
    public void after() {
        session.close();
    }

}