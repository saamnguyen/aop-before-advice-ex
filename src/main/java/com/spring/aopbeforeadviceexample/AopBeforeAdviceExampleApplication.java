package com.spring.aopbeforeadviceexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(proxyTargetClass = true)
@SpringBootApplication
public class AopBeforeAdviceExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopBeforeAdviceExampleApplication.class, args);
    }

}
