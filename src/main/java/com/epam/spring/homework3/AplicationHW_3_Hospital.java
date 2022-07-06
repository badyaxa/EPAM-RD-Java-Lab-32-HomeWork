package com.epam.spring.homework3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AplicationHW_3_Hospital {

    public static void main(String[] args) {
        System.out.println("---Hospital");
        SpringApplication.run(AplicationHW_3_Hospital.class, args);

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        final String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println("---beanDefinitionName = " + beanDefinitionName);
//        }
//        context.close();
    }
}
