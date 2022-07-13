package com.epam.spring.homework2.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("============CustomBeanFactoryPostProcessor postProcessBeanFactory()============");

        System.out.println("getInitMethodName() = " + configurableListableBeanFactory.getBeanDefinition("beanB").getInitMethodName());

        configurableListableBeanFactory.getBeanDefinition("beanB").setInitMethodName("secondCustomInitMethodBeanB");

        System.out.println("getInitMethodName() = " + configurableListableBeanFactory.getBeanDefinition("beanB").getInitMethodName());

        System.out.println("============CustomBeanFactoryPostProcessor postProcessBeanFactory()============");
    }
}
