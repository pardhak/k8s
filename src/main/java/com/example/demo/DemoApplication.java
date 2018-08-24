package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.*;

@SpringBootApplication
@RestController
public class DemoApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello Dcker World";
    }
    
    @RequestMapping("/test")
    public String test() {
        Test test1 = new Test();
        Thread t1 = new Thread(test1);
        
        Test test2 = new Test();
        Thread t2 = new Thread(test2);
        
        t1.start();
        t2.start();
        
        return "Executed";
        
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}