package org.example.multimodule.order.controller.converter;

import org.example.multimodule.order.controller.dto.OrderResponseDTO;
import org.example.multimodule.order.domain.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderDTOConverter {

    OrderDTOConverter INSTANCE = Mappers.getMapper(OrderDTOConverter.class);

    OrderResponseDTO OrderToOrderResponseDTO(Order order);
}
