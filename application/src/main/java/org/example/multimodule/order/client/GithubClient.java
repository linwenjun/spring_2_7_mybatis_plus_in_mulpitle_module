package org.example.multimodule.order.client;

import java.util.Map;


public interface GithubClient {
    Map<String, String> getStores();
    Map<String, String> getUser();
}
