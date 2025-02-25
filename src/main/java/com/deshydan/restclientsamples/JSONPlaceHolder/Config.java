package com.deshydan.restclientsamples.JSONPlaceHolder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class Config {

    @Bean("rest-client")
    JsonPlaceholderService jsonPlaceholderService() {
        RestClient restClient = RestClient.create(
                "https://jsonplaceholder.typicode.com"
        );

        return HttpServiceProxyFactory
                .builderFor(RestClientAdapter.create(restClient))
                .build()
                .createClient(JsonPlaceholderService.class);


    }
}
