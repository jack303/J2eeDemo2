package com.hwadee.dao;

import com.hwadee.entity.Weibo;
import com.hwadee.model.WeiboDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface WeiboMapper {
    int deleteByPrimaryKey(Integer wid);

    int insert(Weibo record);

    int insertSelective(Weibo record);

    Weibo selectByPrimaryKey(Integer wid);

    int updateByPrimaryKeySelective(Weibo record);

    int updateByPrimaryKey(Weibo record);

    int count(int aid);

    List<WeiboDto> list(@Param("aid") int aid, @Param("start") int start, @Param("offset") int offset);

}