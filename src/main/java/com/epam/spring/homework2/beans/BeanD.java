package com.epam.spring.homework2.beans;

public class BeanD extends BeanFather {

    public BeanD(String name, int value) {
        super(name, value);
    }

    public void customInitMethodBeanD() {
        System.out.println("BeanD customInitMethod()");
    }

    public void customDestroyMethodBeanD() {
        System.out.println("BeanD customDestroyMethod()");
    }
}
