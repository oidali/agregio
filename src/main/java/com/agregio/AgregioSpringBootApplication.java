package com.agregio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgregioSpringBootApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(AgregioSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args){
        System.out.println("Hello Agregio");
    }
}
