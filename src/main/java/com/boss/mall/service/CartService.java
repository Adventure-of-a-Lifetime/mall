package com.boss.mall.service;

import com.boss.mall.dao.OrderItemDAO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xueyue
 * @version 1.0
 * @date 2020/7/10 9:25
 */
public class CartService {
    @Autowired
    OrderItemDAO orderItemDAO;
}
