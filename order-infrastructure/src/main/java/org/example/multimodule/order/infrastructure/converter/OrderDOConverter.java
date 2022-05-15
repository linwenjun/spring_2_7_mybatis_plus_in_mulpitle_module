package org.example.multimodule.order.infrastructure.converter;

import org.example.multimodule.order.domain.Order;
import org.example.multimodule.order.infrastructure.persistent.dataobject.OrderDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderDOConverter {

    OrderDOConverter INSTANCE = Mappers.getMapper(OrderDOConverter.class);

    @Mapping(target = "code", ignore = true)
    Order toDomain(OrderDO orderDO);
}
