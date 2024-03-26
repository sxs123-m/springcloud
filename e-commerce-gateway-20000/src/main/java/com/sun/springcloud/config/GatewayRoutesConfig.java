package com.sun.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 *
 * @Author sun
 * @Create 2024/3/26 11:36
 * @Version 1.0
 */
// @Configuration
// public class GatewayRoutesConfig {
//     @Bean
//     public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder) {
//         RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
//
//         // 这里使用了Lambda表达式，理解为规定写法即可
//         return routes.route("member_route04",
//                 r -> r.path("/member/get/**").uri("http://localhost:10001")).build();
//     }
// }
