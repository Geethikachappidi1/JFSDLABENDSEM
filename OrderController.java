package com.klef.jfsd.exam.controller;

import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    @GetMapping
    public List<Order> getOrders() {
        return orderService.getAllOrders();
    }
}
