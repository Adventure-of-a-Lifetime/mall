package com.boss.mall.dao;

import com.boss.mall.entity.Goods;
import com.boss.mall.entity.Order;
import com.boss.mall.entity.OrderItem;

import java.util.List;

/**
 * @author xueyue
 * @version 1.0
 * @date 2020/7/10 9:22
 */
public interface OrderInfoDAO {
    List<Order> select();

    int save(Order order);

    int upData(OrderItem orderItem);

    List<Goods> selectGoods();
}
