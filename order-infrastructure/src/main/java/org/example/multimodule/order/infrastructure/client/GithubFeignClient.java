package org.example.multimodule.order.infrastructure.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(name = "github" , primary = false, url = "https://api.github.com")
public interface GithubFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/", consumes = "application/json")
    Map<String, String> getStores();

    @RequestMapping(method = RequestMethod.GET, value = "/user", consumes = "application/json")
    Map<String, String> getUser();
}
