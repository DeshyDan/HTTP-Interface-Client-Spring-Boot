package com.deshydan.restclientsamples;


import com.deshydan.restclientsamples.JSONPlaceHolder.JsonPlaceholderService;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class PostService {

    private final RestClient restClient;
    private final JsonPlaceholderService jsonPlaceholderService;

    public PostService(RestClient.Builder builder, JsonPlaceholderService jsonPlaceholderService) {

        JdkClientHttpRequestFactory requestFactory = new JdkClientHttpRequestFactory();
        requestFactory.setReadTimeout(10000);
        this.restClient = builder
                .baseUrl("https://jsonplaceholder.typicode.com")
                .requestFactory(requestFactory)
                .build();

        this.jsonPlaceholderService = jsonPlaceholderService;

    }

//    public String findAll() {
//        return restClient.get()
//                .uri("/posts")
//                .retrieve()
//                .body(String.class);
//    }
    public String findAll(){
        return jsonPlaceholderService
                .getAllPosts();
    }
}
