package org.example.multimodule.order.repository;

import org.example.multimodule.order.domain.Order;

import java.util.List;

public interface OrderRepository {
    Order selectById(String id);

    List<Order> allOrders();
}
