package com.hwadee.entity;

import java.io.Serializable;

public class Account implements Serializable {
    private Integer aid;
    private String email;
    private String nickName;//驼峰命名；
    private String password;
    private int follow;
    private int fans;
    private int weibo;
    private String pic;
    public Integer getAid() {
        return aid;
    }
    public void setAid(Integer aid) {
        this.aid = aid;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getFollow() {
        return follow;
    }
    public void setFollow(int follow) {
        this.follow = follow;
    }
    public int getFans() {
        return fans;
    }
    public void setFans(int fans) {
        this.fans = fans;
    }
    public int getWeibo() {
        return weibo;
    }
    public void setWeibo(int weibo) {
        this.weibo = weibo;
    }
    public String getPic() {
        return pic;
    }
    public void setPic(String pic) {
        this.pic = pic;
    }
    @Override
    public String toString() {
        return "Account [aid=" + aid + ", email=" + email + ", nickName=" + nickName + ", password=" + password
                + ", follow=" + follow + ", fans=" + fans + ", weibo=" + weibo + ", pic=" + pic + "]";
    }

}
