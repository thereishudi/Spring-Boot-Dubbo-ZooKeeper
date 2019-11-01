package com.hd.hello.dubbo.service.user.provider;


import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloDubboServiceProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloDubboServiceProviderApplication.class,args);
        Main.main(args);
    }
}
