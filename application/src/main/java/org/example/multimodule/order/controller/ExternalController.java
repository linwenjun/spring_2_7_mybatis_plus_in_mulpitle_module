package org.example.multimodule.order.controller;

import org.example.multimodule.order.client.GithubClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/external")
@RequiredArgsConstructor
public class ExternalController {

    @Autowired
    private final GithubClient githubClient;

    @GetMapping("/github")
    public Map<String, String> data() {
        return githubClient.getStores();
    }

    @GetMapping("/github-un-auth-user")
    public Map<String, String> user() {
        return githubClient.getUser();
    }
}
