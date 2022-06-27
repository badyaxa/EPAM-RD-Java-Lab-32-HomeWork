package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

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

    @Bean(name = "beanC", initMethod = "customInitMethodBeanC", destroyMethod = "customDestroyMethodBeanC")
    @DependsOn("beanB")
    public BeanC getBeanC() {
        return new BeanC(nameC, valueC);
    }

    @Bean(name = "beanD", initMethod = "customInitMethodBeanD", destroyMethod = "customDestroyMethodBeanD")
    public BeanD getBeanD() {
        return new BeanD(nameD, valueD);
    }

    @Bean("beanF")
    @Lazy
    public BeanF getBeanF(){
        return new BeanF("NameBeanF", 6);
    }

    @Bean("beanA")
    public BeanA getBeanA(){
        return new BeanA("NameBeanA", 1);
    }
}