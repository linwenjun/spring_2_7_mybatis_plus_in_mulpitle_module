package org.example.multimodule.order.infrastructure.persistent.jdbc;

import org.example.multimodule.order.domain.Order;
import org.example.multimodule.order.infrastructure.client.GithubFeignClient;
import org.example.multimodule.order.infrastructure.persistent.dataobject.OrderDO;
import org.example.multimodule.order.infrastructure.persistent.mapper.OrderMapper;
import org.example.multimodule.order.infrastructure.persistent.mapper.UserMapper;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO 先通过测试
// TODO 替换spring boot test 注解
//@ExtendWith(SpringExtension.class)
@JdbcTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@EnableJdbcRepositories("org.example.multimodule.order.infrastructure.persistent.jdbc")
public class OrderDomainRepositoryImplTest {
    @Autowired
    OrderDomainJDBCRepository orderDomainRepository;

    @MockBean
    GithubFeignClient githubFeignClient;

    @MockBean
    OrderMapper orderMapper;

    @MockBean
    UserMapper userMapper;

    @Test
    @Sql("/fixture/insert_user_n_order.sql")
    void should_load_data() {
        Optional<OrderDO> order = orderDomainRepository.findById(1);
        assertEquals(1, order.get().getId());
    }
}
