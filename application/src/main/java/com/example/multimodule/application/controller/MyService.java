package com.example.multimodule.application.controller;

import com.example.multimodule.infrastructure.dataobject.OrderDO;
import com.example.multimodule.infrastructure.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {

	@Autowired
	private OrderMapper orderMapper;

	public OrderDO orders(String id) {
		return this.orderMapper.selectById(id);
	}

	public List<OrderDO> allOrders() {
		return this.orderMapper.selectList(null);
	}
}
