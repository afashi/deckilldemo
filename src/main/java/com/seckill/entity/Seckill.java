package com.seckill.entity;

import java.util.Date;

public class Seckill {
    private long seckillId;
    private String name;
    private long number;
    private Date startTime;
    private Date endTime;
    private Date createTime;

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Date getStartTime() {
        return (Date) startTime.clone();
    }

    public void setStartTime(Date startTime) {
        this.startTime = (Date) startTime.clone();
    }

    public Date getEndTime() {
        return (Date)endTime.clone();
    }

    public void setEndTime(Date endTime) {
        this.endTime = (Date) endTime.clone();
    }

    public Date getCreateTime() {
        return (Date) createTime.clone();
    }

    public void setCreateTime(Date createTime) {
        this.createTime = (Date) createTime.clone();
    }

    @Override
    public String toString() {
        return "Seckill{" +
                "seckillId=" + seckillId +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                '}';
    }
}
