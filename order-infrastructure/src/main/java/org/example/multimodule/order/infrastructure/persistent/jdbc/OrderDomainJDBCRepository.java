package org.example.multimodule.order.infrastructure.persistent.jdbc;

import org.example.multimodule.order.infrastructure.persistent.dataobject.OrderDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDomainJDBCRepository extends CrudRepository<OrderDO, Integer> {
}
