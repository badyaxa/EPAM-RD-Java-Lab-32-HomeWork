package com.epam.spring.homework2;

import com.epam.spring.homework2.beans.BeanB;
import com.epam.spring.homework2.beans.BeanC;
import com.epam.spring.homework2.beans.BeanD;
import com.epam.spring.homework2.config.BeanBConfigFromProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AplicationHW_2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanBConfigFromProperties.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }

        System.out.println("=================================================");

        BeanB beanB = context.getBean(BeanB.class);
        BeanC beanC = context.getBean(BeanC.class);
        BeanD beanD = context.getBean(BeanD.class);
        System.out.println("beanB = " + beanB);
        System.out.println("beanC = " + beanC);
        System.out.println("beanD = " + beanD);
    }
}
