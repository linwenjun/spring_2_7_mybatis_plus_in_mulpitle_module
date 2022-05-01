package com.example.multimodule.application.controller;

import com.example.multimodule.application.service.OrderService;
import com.example.multimodule.infrastructure.dataobject.OrderDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{id}")
    public OrderDO orders(@PathVariable String id) {
        return this.orderService.orders(id);
    }

    @GetMapping
    public List<OrderDO> allOrders() {
        return this.orderService.allOrders();
    }
}
