package org.example.multimodule.order.manager;

import lombok.RequiredArgsConstructor;
import org.example.multimodule.order.client.SkuClient;
import org.example.multimodule.order.domain.Order;

@RequiredArgsConstructor
public class OrderManager {

    private final SkuClient skuClient;

    void assembleOrderInfo(Order order) {
        String code = skuClient.getCodeByName(order.getName());
        order.updateCode(code);
    }
}
