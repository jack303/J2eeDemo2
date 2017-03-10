package com.hwadee.entity;

public class LikedKey {
    private Integer aid;

    private Integer wid;

    public LikedKey(Integer aid, Integer wid) {
        this.aid = aid;
        this.wid = wid;
    }

    public LikedKey() {
        super();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }
}