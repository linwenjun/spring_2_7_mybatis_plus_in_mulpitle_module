package org.example.multimodule.order

import io.restassured.module.mockmvc.RestAssuredMockMvc
import io.restassured.module.mockmvc.response.MockMvcResponse
import org.junit.jupiter.api.BeforeEach
import org.mybatis.spring.annotation.MapperScan
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.test.context.jdbc.Sql
import org.springframework.test.web.servlet.MockMvc
import org.springframework.web.context.WebApplicationContext
import spock.lang.Specification

@SpringBootTest
class ApiSpec extends Specification {

    @Autowired
    private WebApplicationContext mac;

    void setup() {
        RestAssuredMockMvc.webAppContextSetup(mac);
    }

    @Sql("/fixture/insert_order.sql")
    def "when get is performed then the response has status 200 and content is 'Hello world!'"() {
        when:
        def response = RestAssuredMockMvc.given()
                .header("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .header("Accept", MediaType.APPLICATION_JSON_VALUE)
                .get("/orders/1");


        then:
        response.then().status(HttpStatus.OK);
    }

}
