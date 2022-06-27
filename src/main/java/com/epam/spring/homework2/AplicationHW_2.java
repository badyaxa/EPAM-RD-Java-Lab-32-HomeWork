package com.epam.spring.homework2;

import com.epam.spring.homework2.beans.BeanB;
import com.epam.spring.homework2.beans.BeanC;
import com.epam.spring.homework2.beans.BeanD;
import com.epam.spring.homework2.beans.BeanF;
import com.epam.spring.homework2.config.BeanConfigFromProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AplicationHW_2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigFromProperties.class);

        System.out.println("===============Вивести перелік усіх бінів==================================");

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }

        System.out.println("===============Вивести перелік усіх бінів==================================");

        BeanB beanB = context.getBean(BeanB.class);
        BeanC beanC = context.getBean(BeanC.class);
        BeanD beanD = context.getBean(BeanD.class);
        System.out.println("beanB = " + beanB);
        System.out.println("beanC = " + beanC);
        System.out.println("beanD = " + beanD);


        System.out.println("=================================================");
        BeanF beanF = context.getBean(BeanF.class);
        System.out.println("beanF = " + beanF);

        System.out.println("=================================================");
        context.close();
    }
}
