package org.example.multimodule.order.infrastructure.persistent.mapper;

import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import org.example.multimodule.order.infrastructure.persistent.dataobject.OrderDO;
import org.example.multimodule.order.infrastructure.persistent.mapper.OrderMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

@MybatisPlusTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback
class OrderMapperTest {

    @Autowired
    OrderMapper orderMapper;

    @Test
    @Sql("/fixture/insert_user_n_order.sql")
    void name() {
        List<OrderDO> orderDOS = orderMapper.selectList(null);
        assertThat(orderDOS, hasSize(2));
    }

    @SpringBootConfiguration
    @MapperScan("org.example.multimodule.order.infrastructure.persistent.mapper")
    static class TestConfiguration {
    }
}