package com.example.multimodule.infrastructure.mapper

import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest
import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.test.annotation.Rollback
import org.springframework.transaction.annotation.Transactional
import spock.lang.Specification

@MybatisPlusTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback
class BasicMapperSpec extends Specification {


}
