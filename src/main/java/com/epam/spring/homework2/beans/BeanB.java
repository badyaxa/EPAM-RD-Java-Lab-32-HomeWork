package com.epam.spring.homework2.beans;

public class BeanB extends BeanFather{

    public BeanB(String name, int value) {
        super(name, value);
    }

    public void customInitMethodBeanB() {
        System.out.println("BeanB customInitMethod()");
    }

    public void customDestroyMethodBeanB() {
        System.out.println("BeanB customDestroyMethod()");
    }

    public void secondCustomInitMethodBeanB() {
        System.out.println("BeanB secondCustomInitMethodBeanB()");
    }
}
