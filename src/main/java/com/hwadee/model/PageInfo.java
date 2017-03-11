package com.hwadee.model;

import java.util.Date;
import java.util.List;

/**
 * Created by localdomain on 2017/3/10.
 */
public class PageInfo {
    //多少条
    private int count;
    //多少页
    private int total;
    //每页多少条
    private int offset = 5;
    //当前第几页
    private int current = 1;
    //
    private int start = 0;
    //
    private List<?> list;

    private Date now;

    public PageInfo() {}

    public PageInfo(int current) {
        this.current = current;
        this.now = new Date();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        this.total = this.count / this.offset + ((this.count % this.offset)>0?1:0);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getOffset() {
        return offset;
    }

/*
    public void setOffset(int offset) {
        this.offset = offset;
    }
*/

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getStart() {
        return (this.current-1)*this.offset;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    @Override
    public String toString() {
        return "start:"+getStart()+"\tcurrent"+getCurrent()
                +"\tlist"+getList().toString();
    }
}
