package org.example.multimodule.order;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import io.restassured.module.mockmvc.response.MockMvcResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.is;

@SpringBootTest
public class ApiTest {

    @Autowired
    private WebApplicationContext mac;

    @BeforeEach
    void setUp() {
        RestAssuredMockMvc.webAppContextSetup(mac);
    }

    @Test
    void should_return_value_when() {
        MockMvcResponse response = RestAssuredMockMvc.given()
                .header("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .header("Accept", MediaType.APPLICATION_JSON_VALUE)
                .get("/orders/1");

        response.then().status(HttpStatus.OK)
                .body("name", is("苹果手机"));
    }
}
