package org.example.multimodule.order.infrastructure.persistent.jdbc;

import lombok.RequiredArgsConstructor;
import org.example.multimodule.order.domain.Order;
import org.example.multimodule.order.infrastructure.converter.OrderDOConverter;
import org.example.multimodule.order.infrastructure.persistent.dataobject.OrderDO;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class OrderDomainRepositoryImpl {
    private final OrderDomainJDBCRepository orderDomainJDBCRepository;
    private final OrderDOConverter converter = OrderDOConverter.INSTANCE;

    public Order findById(int id) {
        OrderDO byId = orderDomainJDBCRepository
                .findById(id)
                .orElseThrow();

        return converter.toDomain(byId);
    }
}
