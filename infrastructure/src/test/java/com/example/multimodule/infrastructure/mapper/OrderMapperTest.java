package com.example.multimodule.infrastructure.mapper;

import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import com.example.multimodule.infrastructure.dataobject.OrderDO;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;
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
    void name() {
        List<OrderDO> orderDOS = orderMapper.selectList(null);
        assertThat(orderDOS, hasSize(0));
    }

    @SpringBootApplication
    @MapperScan("com.example.multimodule.infrastructure.mapper")
    static class TestConfiguration {
    }
}