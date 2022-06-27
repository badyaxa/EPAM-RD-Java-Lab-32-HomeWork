package com.epam.spring.homework2.beans;

public class BeanC {

    private String name;
    private int value;

    public BeanC(String name, int value) {
        System.out.println("created BeanC");
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
        return "BeanC{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public void customInitMethodBeanC() {
        System.out.println("customInitMethodBeanC");
    }

    public void customDestroyMethodBeanC() {
        System.out.println("customDestroyMethodBeanC");
    }
}
