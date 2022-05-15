package org.example.multimodule.order.service;

import org.example.multimodule.order.repository.OrderRepository;
import org.example.multimodule.order.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

	private final OrderRepository orderRepository;

	public Order orders(String id) {
		return this.orderRepository.selectById(id);
	}

	public List<Order> allOrders() {
		return this.orderRepository.allOrders();
	}
}
