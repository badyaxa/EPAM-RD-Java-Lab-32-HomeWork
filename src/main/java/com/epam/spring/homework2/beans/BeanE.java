package com.epam.spring.homework2.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanE extends BeanFather {

    public BeanE(String name, int value) {
        super(name, value);
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
