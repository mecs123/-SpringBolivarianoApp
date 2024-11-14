package com.microservice.gateway.config;


import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi studentApi() {
        return GroupedOpenApi.builder()
                .group("students")
                .pathsToMatch("/api/student/**")
                .build();
    }

        @Bean
        public GroupedOpenApi courseApi() {
            return GroupedOpenApi.builder()
                    .group("courses")
                    .pathsToMatch("/api/course/**")
                    .build();
        }
}