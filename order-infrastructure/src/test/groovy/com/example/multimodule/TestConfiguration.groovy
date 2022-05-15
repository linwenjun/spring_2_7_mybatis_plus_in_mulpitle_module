package com.example.multimodule

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@MapperScan("org.example.multimodule.order.infrastructure.persistent.mapper")
class TestConfiguration {
}
