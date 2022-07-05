package com.epam.spring.homework1;

import com.epam.spring.homework1.config.BeansConfig;
import com.epam.spring.homework1.pet.Cheetah;
import com.epam.spring.homework1.pet.Pet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationHW_1 {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
        context.getBean(Pet.class).printPets();

        System.out.println("context.getBean(Cheetah.class) = " + context.getBean(Cheetah.class));

        System.out.println("context.getBean(\"getPrimaryCheetah\") = " + context.getBean("getPrimaryCheetah"));

        System.out.println("context.getBean(\"cheetahWithQualifier\") = " + context.getBean("getCheetahWithQualifier"));
    }
}
