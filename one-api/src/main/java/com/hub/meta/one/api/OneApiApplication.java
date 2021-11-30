package com.hub.meta.one.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
public class OneApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneApiApplication.class, args);
    }

}
