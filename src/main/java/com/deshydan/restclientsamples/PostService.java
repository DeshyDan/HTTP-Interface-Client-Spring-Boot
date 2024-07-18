package com.deshydan.restclientsamples;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class PostService {

    private final RestClient restClient;

    public PostService(RestClient.Builder builder) {
        this.restClient = builder
                .baseUrl("https://jsonplaceholder.typicode.com")
                .build();

    }

    public String findAll() {
        return restClient.get()
                .uri("/posts")
                .retrieve()
                .body(String.class);
    }
}
