package com.zyfx.yuanweiming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableEurekaClient
@EnableSwagger2
@EnableTransactionManagement
//@MapperScan("com.zyfx-yuanweiming.mapper")
//@ComponentScan(basePackages = {"com.zyfx-yuanweiming", "com.zyfx-yuanweiming.service"})
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }


}

