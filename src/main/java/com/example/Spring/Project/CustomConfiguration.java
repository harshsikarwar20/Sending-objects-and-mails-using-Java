package com.example.Spring.Project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration // What ever objects will be created in this class that spring will call them we will not call them.
@ComponentScan(basePackages = {"ComponentScan"})
public class CustomConfiguration {

    @Bean("Harsh")
    @Lazy
    public Student getStudent1(){
        System.out.println("Spring call... in config bean of student");
        return new Student("Harsh");
    }

    @Bean("Tejasvi")
    public Student getStudent2(){
        System.out.println("Spring call... in config bean of student");
        return new Student("Tejasvi");
    }
}
