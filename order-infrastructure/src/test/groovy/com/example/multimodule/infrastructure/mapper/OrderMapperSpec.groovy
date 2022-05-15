package com.example.multimodule.infrastructure.mapper

import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest
import org.example.multimodule.order.infrastructure.persistent.mapper.OrderMapper
import org.mybatis.spring.annotation.MapperScan
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.test.annotation.Rollback
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.jdbc.Sql
import org.springframework.transaction.annotation.Transactional
import spock.lang.Specification

class OrderMapperSpec extends BasicMapperSpec {

    @Autowired
    OrderMapper orderMapper;

    @Sql("/fixture/insert_user_n_order.sql")
    def "should load single record"() {
        when:
        def actual = orderMapper.selectList(null);

        then:
        actual.size() == 4
        actual[0].getOrderItems().size() == 1
        actual[0].getOrderItems()[0].price == 70000.00
        actual[0].getOrderItems()[0].sku == '13Max'
    }

    @Sql("/fixture/insert_user_n_order.sql")
    def "should load all record"() {
        when:
        def actual = orderMapper.all();

        then:
        actual.size() == 4
        actual[0].getId() == 1L
        actual[0].getUser().getId() == 1L
    }
}
