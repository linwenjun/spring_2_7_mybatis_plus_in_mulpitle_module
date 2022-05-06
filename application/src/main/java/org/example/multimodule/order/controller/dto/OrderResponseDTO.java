package org.example.multimodule.order.controller.dto;

import lombok.*;
import org.example.multimodule.order.domain.Order;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderResponseDTO {

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class OrderItem {
        private String sku;
        private BigDecimal price;
        private int amount;
    }

    private int id;
    private String name;
    private BigDecimal price;
    private List<Order.OrderItem> orderItems;
    private int amount;
}
