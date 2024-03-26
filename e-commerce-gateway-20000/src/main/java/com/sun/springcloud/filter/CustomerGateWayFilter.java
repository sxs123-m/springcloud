// package com.sun.springcloud.filter;
//
// import org.springframework.cloud.gateway.filter.GatewayFilterChain;
// import org.springframework.cloud.gateway.filter.GlobalFilter;
// import org.springframework.core.Ordered;
// import org.springframework.http.HttpStatus;
// import org.springframework.stereotype.Component;
// import org.springframework.web.server.ServerWebExchange;
// import reactor.core.publisher.Mono;
//
// /**
//  * Description: 编写全局过滤器
//  *
//  * @Author sun
//  * @Create 2024/3/26 18:50
//  * @Version 1.0
//  */
// @Component
// public class CustomerGateWayFilter implements GlobalFilter, Ordered {
//     /**
//      * 在远程调用之前判断请求的参数user是否等于sun，pwd是否等于666
//      *
//      * @param exchange the current server exchange
//      * @param chain    provides a way to delegate to the next filter
//      * @return
//      */
//     @Override
//     public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//         System.out.println("CustomerGateWayFilter被执行");
//         // 获取请求的参数，由于使用get方法返回的是一个list所以需要get（0）
//         String user = exchange.getRequest().getQueryParams().get("user").get(0);
//         // 使用getFirst相当于获取了请求参数名为pwd的第一个元素
//         String pwd = exchange.getRequest().getQueryParams().getFirst("pwd");
//
//         // 不满足要求就设置状态码之后直接返回
//         if (!("sun".equals(user) && "666".equals(pwd))) {
//             System.out.println("非法用户");
//             // 设置响应的状态码
//             exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
//             // 返回
//             return exchange.getResponse().setComplete();
//         }
//         System.out.println("放行");
//
//         // 满足要求就放行
//         return chain.filter(exchange);
//     }
//
//
//     /**
//      * 根据返回的值来决定过滤器调用的顺序，数字越小则优先级越高
//      *
//      * @return
//      */
//     @Override
//     public int getOrder() {
//         return 0;
//     }
// }
