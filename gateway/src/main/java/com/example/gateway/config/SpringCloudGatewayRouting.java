package com.example.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudGatewayRouting {
    @Bean
    public RouteLocator configurationRoute(RouteLocatorBuilder rlb) {

        return rlb.routes()
                .route("testId", r -> r.path("/test/**")
                        .uri("lb://sample-api"))
                .route("testId22", r -> r.path("/test2/**")
                        .uri("lb://sample-api"))
                .route("kafkaID", r -> r.path("/kafka/**")
                        .uri("lb://sample-api"))
                .build();
    }
}
