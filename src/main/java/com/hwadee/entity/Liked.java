package com.hwadee.entity;

import java.util.Date;

public class Liked extends LikedKey {
    private Date ltime;

    public Liked(Integer aid, Integer wid, Date ltime) {
        super(aid, wid);
        this.ltime = ltime;
    }

    public Liked() {
        super();
    }

    public Date getLtime() {
        return ltime;
    }

    public void setLtime(Date ltime) {
        this.ltime = ltime;
    }
}