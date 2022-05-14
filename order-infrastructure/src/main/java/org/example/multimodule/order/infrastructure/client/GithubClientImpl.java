package org.example.multimodule.order.infrastructure.client;

import org.example.multimodule.order.client.GithubClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class GithubClientImpl implements GithubClient {

    private final GithubFeignClient githubFeignClient;

    @Override
    public Map<String, String> getStores() {
        return githubFeignClient.getStores();
    }

    @Override
    public Map<String, String> getUser() {
        return githubFeignClient.getUser();
    }
}
