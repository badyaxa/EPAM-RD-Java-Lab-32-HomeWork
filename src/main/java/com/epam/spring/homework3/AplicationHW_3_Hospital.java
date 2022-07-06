package com.epam.spring.homework3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
@SpringBootApplication
public class AplicationHW_3_Hospital {

    public static void main(String[] args) {

        log.info("---Hospital");

        SpringApplication.run(AplicationHW_3_Hospital.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        final String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("---beanDefinitionName = " + beanDefinitionName);
        }
        context.close();
    }
}
