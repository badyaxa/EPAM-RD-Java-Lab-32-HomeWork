package com.epam.spring.homework2.beans;

public class BeanD {

    private String name;
    private int value;

    public BeanD(String name, int value) {
        System.out.println("BeanD created");
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
        return "BeanD{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public void customInitMethodBeanD() {
        System.out.println("BeanD customInitMethod()");
    }

    public void customDestroyMethodBeanD() {
        System.out.println("BeanD customDestroyMethod()");
    }
}
