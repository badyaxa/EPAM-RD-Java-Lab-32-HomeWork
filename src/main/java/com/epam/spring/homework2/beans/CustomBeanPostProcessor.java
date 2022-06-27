package com.epam.spring.homework2.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomBeanPostProcessor postProcessBeforeInitialization() " + beanName);
        if (bean instanceof BeanFather) {
            if (((BeanFather) bean).getName() == null) {
                System.out.println("CustomBeanPostProcessor " + beanName + " name is null");
                System.out.println("CustomBeanPostProcessor Set new name = newName" + beanName);
                ((BeanFather) bean).setName(beanName + "NewName");
            }

            if (((BeanFather) bean).getValue() < 0) {
                System.out.println("CustomBeanPostProcessor " + beanName + " value is less than 0");
                System.out.println("CustomBeanPostProcessor Set new value = 999");
                ((BeanFather) bean).setValue(999);
            }
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomBeanPostProcessor postProcessAfterInitialization() " + beanName);
        if(bean instanceof BeanFather){
            if (((BeanFather) bean).getName() != null) {
                System.out.println("CustomBeanPostProcessor " + beanName + " name is not null");
            }

            if (((BeanFather) bean).getValue() > 0) {
                System.out.println("CustomBeanPostProcessor " + beanName + " value is greater than 0");
            }
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
