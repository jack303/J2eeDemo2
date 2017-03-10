package com.hwadee.dao;

import com.hwadee.entity.Weibo;
import org.springframework.stereotype.Component;

@Component
public interface WeiboMapper {
    int deleteByPrimaryKey(Integer wid);

    int insert(Weibo record);

    int insertSelective(Weibo record);

    Weibo selectByPrimaryKey(Integer wid);

    int updateByPrimaryKeySelective(Weibo record);

    int updateByPrimaryKey(Weibo record);
}