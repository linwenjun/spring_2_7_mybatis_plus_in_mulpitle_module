package org.example.multimodule.order.repository;

import org.example.multimodule.order.domain.Order;

public interface OrderRepository {
    Order selectById(String id);
}
