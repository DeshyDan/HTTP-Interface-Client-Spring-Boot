package com.deshydan.restclientsamples.JSONPlaceHolder;

import org.springframework.web.service.annotation.GetExchange;

public interface JsonPlaceholderService {

    @GetExchange("/posts")
    String getAllPosts();
}
