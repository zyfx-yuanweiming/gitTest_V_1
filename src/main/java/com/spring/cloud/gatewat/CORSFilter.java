//package com.spring.cloud.gatewat;
//
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.server.reactive.ServerHttpRequest;
//import org.springframework.http.server.reactive.ServerHttpResponse;
//import org.springframework.stereotype.Component;
//import org.springframework.web.cors.reactive.CorsUtils;
//import org.springframework.web.server.ServerWebExchange;
//import org.springframework.web.server.WebFilter;
//import org.springframework.web.server.WebFilterChain;
//import reactor.core.publisher.Mono;
//import tk.mybatis.mapper.util.StringUtil;
//
///**
// * @Description
// * @Author yuanwm
// * @Date 2020/5/8 10:18
// **/
//@Component
//@Order(Ordered.HIGHEST_PRECEDENCE)
//public class CORSFilter implements WebFilter {
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange swe, WebFilterChain wfc) {
//        ServerHttpRequest request = swe.getRequest();
//        if (CorsUtils.isCorsRequest(request)) {
//            ServerHttpResponse response = swe.getResponse();
//            HttpHeaders headers = response.getHeaders();
//            String first = request.getHeaders().getFirst("avaMdmCorsFlag");
//            if(StringUtil.isEmpty(first)){
//                request.mutate().header("avaMdmCorsFlag", "1").build();
//                headers.add("Access-Control-Allow-Origin", "*");
//                headers.add("Access-Control-Allow-Methods", "*");
//                headers.add("Access-Control-Max-Age", "3600");
//                headers.add("Access-Control-Allow-Headers", "Content-Type");
//                if (request.getMethod() == HttpMethod.OPTIONS) {
//                    response.setStatusCode(HttpStatus.OK);
//                    return Mono.empty();
//                }
//            }
//        }
//        return wfc.filter(swe);
//    }
//}
//
