package com.boss.mall.entity;

/**
 * @author xueyue
 * @version 1.0
 * @date 2020/7/10 9:23
 */
public class OrderItem {
    private long id;

    private long infoId;

    private long goodsId;

    private String name;

    private float price;

    private int number;

    public OrderItem() {
        this.id = 10;
        this.infoId = 10;
        this.goodsId = 1;
        this.name = new String("milkOrder");
        this.price = 3.14F;
        this.number = 5;
    }

    public OrderItem(long goodsId, int number) {
        this.price = 2.5F;
        this.goodsId = goodsId;
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getInfoId() {
        return infoId;
    }

    public void setInfoId(long infoId) {
        this.infoId = infoId;
    }

    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", infoId=" + infoId +
                ", goodsId=" + goodsId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }
}
