package org.example.multimodule.order.infrastructure.persistent.impl;

import org.example.multimodule.order.domain.Order;
import org.example.multimodule.order.infrastructure.converter.OrderDOConverter;
import org.example.multimodule.order.infrastructure.persistent.dataobject.OrderDO;
import org.example.multimodule.order.infrastructure.persistent.mapper.OrderMapper;
import org.example.multimodule.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {

    private final OrderMapper orderMapper;

    private final OrderDOConverter converter = OrderDOConverter.INSTANCE;


    @Override
    public Order selectById(String id) {
        OrderDO orderDO = orderMapper.selectById(id);
        return converter.toDomain(orderDO);
    }

    @Override
    public List<Order> allOrders() {
        return orderMapper.all().stream()
                .map(converter::toDomain).collect(Collectors.toList());
    }
}
