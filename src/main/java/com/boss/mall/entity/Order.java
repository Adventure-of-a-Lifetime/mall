package com.boss.mall.entity;

import java.util.Date;
import java.util.HashMap;

/**
 * @author xueyue
 * @version 1.0
 * @date 2020/7/10 9:23
 */
public class Order {
    private Long id;

    private Long uid;

    private String sn;

    private int success;

    private float expend;

    private HashMap<String, OrderItem> item;

    private Date date;

    public Order() {
        this.uid = 12L;
        this.sn = new String("123654789");
    }


    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public HashMap<String, OrderItem> getItem() {
        return item;
    }

    public void setItem(HashMap<String, OrderItem> item) {
        this.item = item;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public float getExpend() {
        return expend;
    }

    public void setExpend(float expend) {
        this.expend = expend;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", uid=" + uid +
                ", sn='" + sn + '\'' +
                ", item=" + item +
                '}';
    }
}
