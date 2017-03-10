package com.hwadee.dao;

import com.hwadee.entity.Liked;
import com.hwadee.entity.LikedKey;
import org.springframework.stereotype.Component;

@Component
public interface LikedMapper {
    int deleteByPrimaryKey(LikedKey key);

    int insert(Liked record);

    int insertSelective(Liked record);

    Liked selectByPrimaryKey(LikedKey key);

    int updateByPrimaryKeySelective(Liked record);

    int updateByPrimaryKey(Liked record);
}