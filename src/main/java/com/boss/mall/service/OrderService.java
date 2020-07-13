package com.boss.mall.service;

import com.boss.mall.dao.OrderInfoDAO;
import com.boss.mall.entity.Goods;
import com.boss.mall.entity.Order;
import com.boss.mall.entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author xueyue
 * @version 1.0
 * @date 2020/7/10 9:25
 */
@Service
public class OrderService {
    @Autowired
    OrderInfoDAO orderInfoDAO;

    public List<Order> select() {
        return orderInfoDAO.select();
    }

    public int save(Order order) {
        Map<String, OrderItem> map = order.getItem();
        float expend = 0;
        for (Map.Entry<String, OrderItem> entry : map.entrySet()) {
            upData(entry.getValue());
            expend += entry.getValue().getNumber() * entry.getValue().getPrice();
        }
        order.setExpend(expend);
        return orderInfoDAO.save(order);
    }

    public int upData(OrderItem orderItem) {
        return orderInfoDAO.upData(orderItem);
    }

    public List<Goods> selectGoods() {
        return orderInfoDAO.selectGoods();
    }

}
