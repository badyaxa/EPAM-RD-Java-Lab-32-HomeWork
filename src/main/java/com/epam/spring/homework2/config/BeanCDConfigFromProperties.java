package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.BeanB;
import com.epam.spring.homework2.beans.BeanC;
import com.epam.spring.homework2.beans.BeanD;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
public class BeanCDConfigFromProperties {

    @Value("${beanC.name}")
    private String nameC;
    @Value("${beanD.name}")
    private String nameD;

    @Value("${beanC.value}")
    private int valueC;

    @Value("${beanD.value}")
    private int valueD;

    @Bean("beanC")
    @DependsOn("beanB")
    public BeanC getBeanC() {
        System.out.println("created BeanC");
        return new BeanC(nameC, valueC);
    }

    @Bean("beanD")
    public BeanD getBeanD() {
        System.out.println("created BeanD");
        return new BeanD(nameD, valueD);
    }
}