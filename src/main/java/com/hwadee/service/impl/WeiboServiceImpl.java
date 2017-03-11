package com.hwadee.service.impl;

import com.hwadee.dao.WeiboMapper;
import com.hwadee.entity.Weibo;
import com.hwadee.model.PageInfo;
import com.hwadee.model.WeiboDto;
import com.hwadee.service.inter.WeiboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by localdomain on 2017/3/9.
 */
@Service
public class WeiboServiceImpl implements WeiboService {
    @Autowired
    WeiboMapper weiboMapper;
    @Override
    public int deployWeibo(Weibo weibo) {
        //存入数据库
        System.out.print("deploy weibo successfully");
        return 0;
    }

    @Override
    public PageInfo list(int aid,int current)
    {
        PageInfo page = new PageInfo();
        int count = weiboMapper.count(aid);
        page.setCurrent(current);
        page.setCount(count);
        List<WeiboDto> weiboList = weiboMapper.list(aid,page.getStart(),page.getOffset());
        page.setList(weiboList);
        return page;
    }
}
