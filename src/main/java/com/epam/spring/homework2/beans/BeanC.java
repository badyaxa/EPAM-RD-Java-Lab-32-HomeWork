package com.epam.spring.homework2.beans;

public class BeanC extends BeanFather{

    public BeanC(String name, int value) {
        super(name, value);
    }

    public void customInitMethodBeanC() {
        System.out.println("BeanC customInitMethod()");
    }

    public void customDestroyMethodBeanC() {
        System.out.println("BeanC customDestroyMethod()");
    }
}
