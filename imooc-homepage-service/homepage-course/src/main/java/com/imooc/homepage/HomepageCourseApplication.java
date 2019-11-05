package com.imooc.homepage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * SpringBoot 启动入口
 * @EnableJpaAuditing 自动加入插入时间戳，更新时间戳等
 * @EnableEurekaClient 向EurekaServer注册
 */
@EnableJpaAuditing
@EnableEurekaClient
@SpringBootApplication
public class HomepageCourseApplication {

    public static void main(String[] args) {

        SpringApplication.run(HomepageCourseApplication.class, args);
    }
}
