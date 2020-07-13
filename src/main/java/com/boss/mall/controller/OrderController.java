package com.boss.mall.controller;

import com.boss.mall.entity.Goods;
import com.boss.mall.entity.Order;
import com.boss.mall.service.OrderService;
import com.boss.mall.utils.SnowFlakeIdFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xueyue
 * @version 1.0
 * @date 2020/7/10 9:24
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/select")
    public List<Order> select() {
        return orderService.select();
    }

    @RequestMapping("/insert")
    public int insert() {
        Order itemOrder = new Order();
        SnowFlakeIdFactory snowFlakeIdFactory = new SnowFlakeIdFactory(10, 10);
        itemOrder.setSn(String.valueOf(snowFlakeIdFactory.nextId()));
        itemOrder.setItem(CartController.cart);
        return orderService.save(itemOrder);
    }

    @RequestMapping("selectGoods")
    public List<Goods> selectGoods() {
        return orderService.selectGoods();
    }
}
