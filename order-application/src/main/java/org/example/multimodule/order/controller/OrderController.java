package org.example.multimodule.order.controller;

import org.example.multimodule.order.controller.converter.OrderDTOConverter;
import org.example.multimodule.order.controller.dto.OrderResponseDTO;
import org.example.multimodule.order.domain.Order;
import org.example.multimodule.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    private final OrderDTOConverter converter = OrderDTOConverter.INSTANCE;

    @GetMapping("/{id}")
    public OrderResponseDTO orders(@PathVariable String id) {
        Order order = this.orderService.orders(id);
        return converter.OrderToOrderResponseDTO(order);
    }
}
