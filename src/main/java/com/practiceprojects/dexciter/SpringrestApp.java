package com.practiceprojects.dexciter;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com/practiceprojects/dexciter/controller")
@ComponentScan("com.practiceprojects.dexciter.service")

public class SpringrestApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringrestApp.class);
    }

//    @GetMapping("/")
//    public String index() {
//        return "Greetings from Spring Boot!";
//    }

}

