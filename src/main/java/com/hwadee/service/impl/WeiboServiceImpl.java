package com.hwadee.service.impl;

import com.hwadee.entity.Weibo;
import com.hwadee.service.inter.WeiboService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by localdomain on 2017/3/9.
 */
@Service("weibo")
public class WeiboServiceImpl implements WeiboService {
    @Override
    public int deployWeibo(Weibo weibo) {
        //存入数据库
        System.out.print("deploy weibo successfully");
        return 0;
    }
}
