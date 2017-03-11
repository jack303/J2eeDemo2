package com.hwadee.service.inter;

import com.hwadee.entity.Weibo;
import com.hwadee.model.PageInfo;

import java.util.List;

/**
 * Created by localdomain on 2017/3/9.
 */
public interface WeiboService {
    int deployWeibo(Weibo weibo);

    PageInfo list(int aid,int current);
}
