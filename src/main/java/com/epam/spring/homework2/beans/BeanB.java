package com.epam.spring.homework2.beans;

public class BeanB {
    private String name;
    private int value;

    public BeanB(String name, int value) {
        System.out.println("BeanB created");
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
        return "BeanB{" + "name='" + name + '\'' + ", value='" + value + '\'' + '}';
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
