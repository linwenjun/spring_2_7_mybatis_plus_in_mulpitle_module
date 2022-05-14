package org.example.multimodule.order.service;

import org.example.multimodule.order.repository.OrderRepository;
import org.example.multimodule.order.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

	private final OrderRepository orderRepository;

	public Order orders(String id) {
		return this.orderRepository.selectById(id);
	}
}
