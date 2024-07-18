package com.deshydan.restclientsamples;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestClientSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestClientSpringBootApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(PostService postService) {
        return args -> {
            var posts = postService.findAll();

            System.out.println(posts);
        };
    }
}
