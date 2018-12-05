package com.anfu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class SmsApplication {
    @RequestMapping("/")
    String index(){
        return "hello spring world";
    }
    public static void main(String[] args) {
        SpringApplication.run(SmsApplication.class, args);
    }
}
