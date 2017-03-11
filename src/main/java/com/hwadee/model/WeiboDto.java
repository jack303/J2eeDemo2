package com.hwadee.model;

import com.hwadee.entity.Account;
import com.hwadee.entity.Liked;
import com.hwadee.entity.Weibo;

/**
 * Created by localdomain on 2017/3/10.
 */
public class WeiboDto {
    private Account account;
    private Weibo weibo;
    private Liked liked;
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public Weibo getWeibo() {
        return weibo;
    }
    public void setWeibo(Weibo weibo) {
        this.weibo = weibo;
    }
    public Liked getLiked() {
        return liked;
    }
    public void setLiked(Liked liked) {
        this.liked = liked;
    }
    @Override
    public String toString() {
        return "WeiboDto [account=" + account + ", weibo=" + weibo + ", liked=" + liked + "]";
    }
}
