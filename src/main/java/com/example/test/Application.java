package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.example.test.Newspringcontroller.Newspring;

@SpringBootApplication
@ComponentScan(basePackageClasses = Newspring.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("***********application started****************");
    }
}
