package org.example.multimodule.order.infrastructure.persistent.jdbc;

import org.example.multimodule.order.infrastructure.persistent.dataobject.OrderDO;
import org.springframework.data.repository.CrudRepository;

public interface OrderDomainJDBCRepository extends CrudRepository<OrderDO, Integer> {
}
