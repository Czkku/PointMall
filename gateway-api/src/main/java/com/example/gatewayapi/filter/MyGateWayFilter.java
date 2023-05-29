package com.example.gatewayapi.filter;

import com.alibaba.nacos.common.utils.JacksonUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

@Component
public class MyGateWayFilter implements GlobalFilter, Order {
    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        System.out.println("自定义过滤器");
//        String token= exchange.getRequest().getQueryParams().getFirst("token");
//        if(StringUtils.isEmpty(token)){
//            ServerHttpResponse response = exchange.getResponse();
//            response.setStatusCode(HttpStatus.NOT_ACCEPTABLE);
//            String msg="token not is null";
//            String code="401";
//            DataBuffer buffer=response.bufferFactory().wrap(code.getBytes());
//            return response.writeWith(Mono.just(buffer));
//        }
//        //否则的话就放行
//        return chain.filter(exchange);
//    }
@Override
public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
    System.out.println("自定义过滤器");
    //1.从请求头中获取token
    ServerHttpRequest request = exchange.getRequest();
    HttpHeaders requestHeaders = request.getHeaders();
    String token = requestHeaders.getFirst("token");


    //2.判断token是否为空
//    if (token != null && token != "") {
//        //3.如果不为空,对token进行校验
//        if ("admin".equals(token)) {
//            return chain.filter(exchange);
//        } else {
//
//            //3.1设置状态码(黑马出品,必出精品)
//            response.setStatusCode(HttpStatus.UNAUTHORIZED);
//
//            //3.2封装返回数据
//            Map<String, Object> map = new HashMap<>();
//            map.put("msg", "token not is null");
//            map.put("code", "401");
//
//            //3.3作JSON转换
//            byte[] bytes = JacksonUtils.toJsonBytes(map);
//
//            //3.4调用bufferFactory方法,生成DataBuffer对象
//            DataBuffer buffer = response.bufferFactory().wrap(bytes);
//
//            //4.调用Mono中的just方法,返回要写给前端的JSON数据
//            return response.writeWith(Mono.just(buffer));
//        }
//    } else {
//        return exchange.getResponse().setComplete();
//    }
//}
        if(StringUtils.isEmpty(token)){
            //3.1设置状态码(黑马出品,必出精品)
            ServerHttpResponse response = exchange.getResponse();
            response.setStatusCode(HttpStatus.NOT_ACCEPTABLE);

            //3.2封装返回数据
            Map<String, Object> map = new HashMap<>();
            map.put("msg", "token not is null");
            map.put("code", "401");

            //3.3作JSON转换
            byte[] bytes = JacksonUtils.toJsonBytes(map);

            //3.4调用bufferFactory方法,生成DataBuffer对象
            DataBuffer buffer = response.bufferFactory().wrap(bytes);

            //4.调用Mono中的just方法,返回要写给前端的JSON数据
            return response.writeWith(Mono.just(buffer));
        }
        //否则的话就放行
        return chain.filter(exchange);
    }
    //指明当前过滤器的权重，数字越小权重越大就越先执行
    @Override
    public int value() {
        return 0;
    }
}
