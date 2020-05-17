package com.parser.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.parser")
public class ParserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParserApplication.class);
    }

}
