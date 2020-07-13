package com.boss.mall.controller;

import com.boss.mall.dao.OrderItemDAO;
import com.boss.mall.entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

/**
 * @author xueyue
 * @version 1.0
 * @date 2020/7/10 9:24
 */
@RestController
public class CartController {
    @Autowired
    OrderItemDAO orderItemDAO;

    public static HashMap<String, OrderItem> cart = new HashMap<>();

    @RequestMapping("/")
    public void create(HttpServletRequest request) {
        HttpSession session = request.getSession();
        OrderItem orderItem = new OrderItem(2L, 15);
        cart.put("1", orderItem);
        orderItem = new OrderItem();
        cart.put("2", orderItem);
        session.setAttribute("cart", cart);
    }

    @RequestMapping("/add")
    public void cartAdd(HttpServletRequest request) {
        HttpSession session = request.getSession();
        cart = (HashMap<String, OrderItem>) session.getAttribute("cart");
    }
}
