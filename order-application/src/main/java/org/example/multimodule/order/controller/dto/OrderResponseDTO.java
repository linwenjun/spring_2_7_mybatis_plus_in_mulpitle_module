package org.example.multimodule.order.controller.dto;

import lombok.*;
import org.example.multimodule.order.domain.Order;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderResponseDTO {

    @Getter
    @Setter(AccessLevel.PROTECTED)
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    static public class UserResponseDTO {
        private Long id;
        private String firstName;
        private String lastName;
        private LocalDate birthDate;
    }

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
    private UserResponseDTO user;
}
