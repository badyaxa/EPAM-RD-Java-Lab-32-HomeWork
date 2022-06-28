package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanA extends BeanFather implements InitializingBean, DisposableBean {

    public BeanA(String name, int value) {
        super(name, value);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanA DisposableBean.destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanA InitializingBean.afterPropertiesSet()");
    }
}
