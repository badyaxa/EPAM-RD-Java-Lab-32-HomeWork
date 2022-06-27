package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanA implements InitializingBean, DisposableBean {

    private String name;
    private int value;

    public BeanA(String name, int value) {
        System.out.println("created BeanA");
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
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
