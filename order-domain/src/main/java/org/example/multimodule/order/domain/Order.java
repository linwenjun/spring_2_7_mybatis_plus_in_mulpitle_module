package org.example.multimodule.order.domain;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter(AccessLevel.PROTECTED)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {

    @Getter
    @Setter(AccessLevel.PROTECTED)
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
    private String code;
    private List<OrderItem> orderItems;

    private User user;

    public void updateCode(String code) {
        this.code = code;
    }
    public int getAmount() {
        return 100;
    }

}
