package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class BeansConfigManual {

    @Bean("beanF")
    @Lazy
    public BeanF getBeanF() {
        return new BeanF(null, 6);
    }

    @Bean("beanA")
    public BeanA getBeanA() {
        return new BeanA("NameBeanA", 1);
    }

    @Bean("beanE")
    public BeanE getBeanE() {
        return new BeanE("NameBeanE", 5);
    }

    @Bean("customBeanFactoryPostProcessor")
    public CustomBeanFactoryPostProcessor getCustomBeanFactoryPostProcessor() {
        System.out.println("CustomBeanFactoryPostProcessor created");
        return new CustomBeanFactoryPostProcessor();
    }

    @Bean("customBeanPostProcessor")
    public CustomBeanPostProcessor getCustomBeanPostProcessor() {
        System.out.println("CustomBeanPostProcessor created");
        return new CustomBeanPostProcessor();
    }
}
