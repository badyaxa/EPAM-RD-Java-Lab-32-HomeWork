package com.epam.spring.homework2.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanE {

    private String name;
    private int value;

    public BeanE(String name, int value) {
        System.out.println("created BeanE");
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
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    @PostConstruct // was deprecated in Java 9, and removed in Java 11,
    public void customPostConstruct() {
        System.out.println("BeanE @PostConstruct customPostConstruct()");
    }

    @PreDestroy  // was deprecated in Java 9, and removed in Java 11,
    public void customPreDestroy() {
        System.out.println("BeanE @PreDestroy customPreDestroy()");
    }
}
