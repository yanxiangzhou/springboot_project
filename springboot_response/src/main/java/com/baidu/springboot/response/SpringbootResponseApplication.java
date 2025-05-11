package com.baidu.springboot.response;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baidu.springboot.response.mapper")
public class SpringbootResponseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootResponseApplication.class, args);
    }

}
