package com.example.multimodule.infrastructure.mapper

import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest
import org.mybatis.spring.annotation.MapperScan
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.test.annotation.Rollback
import org.springframework.test.context.jdbc.Sql
import org.springframework.transaction.annotation.Transactional
import spock.lang.Specification

@MybatisPlusTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
//@Rollback
class OrderMapperSpec extends Specification {

    @Autowired
    OrderMapper orderMapper;

    @Sql("/fixture/insert_order.sql")
    def "should load single record"() {
        when:
        def actual = orderMapper.selectList(null);

        then:
//        print(actual)
        actual.size() == 2
        actual[0].getOrderItem().size() == 1
//        actual[0].getOrderItem()[0].price == "70000.00"
    }

    @SpringBootApplication
    @MapperScan("com.example.multimodule.infrastructure.mapper")
    static class TestConfiguration {
    }
}
