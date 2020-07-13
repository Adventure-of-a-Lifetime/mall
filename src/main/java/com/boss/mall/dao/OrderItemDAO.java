package com.boss.mall.dao;

import com.boss.mall.entity.OrderItem;

/**
 * @author xueyue
 * @version 1.0
 * @date 2020/7/10 9:22
 */
public interface OrderItemDAO {
    int create(OrderItem orderItem);

    int upData(OrderItem orderItem);

    int delete(OrderItem orderItem);
}
