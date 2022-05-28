package org.example.multimodule.order.infrastructure.persistent.jdbc;

import org.example.multimodule.order.domain.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO 先通过测试
// TODO 替换spring boot test 注解
//@ExtendWith(SpringExtension.class)
@SpringBootTest
public class OrderDomainRepositoryImplTest {
    @Autowired
    OrderDomainRepositoryImpl orderDomainRepository;

    @Test
    @Sql("/fixture/insert_user_n_order.sql")
    void should_load_data() {
        Order order = orderDomainRepository.findById(1);
        assertEquals(1, order.getId());
    }
}
