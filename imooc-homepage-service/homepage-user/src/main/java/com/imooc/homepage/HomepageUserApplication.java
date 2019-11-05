package com.imooc.homepage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * <h1>用户服务启动入口</h1>
 * @EnableFeignClients 使用Feign功能，远程调用微服务
 * @EnableCircuitBreaker 使用熔断功能
 */
@EnableJpaAuditing
@EnableFeignClients
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class HomepageUserApplication {

    public static void main(String[] args) {

        SpringApplication.run(HomepageUserApplication.class, args);
    }
}
