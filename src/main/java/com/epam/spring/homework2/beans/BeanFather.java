package com.epam.spring.homework2.beans;

public class BeanFather {

    private String name;
    private int value;

    public BeanFather(String name, int value) {
        System.out.println(this.getClass().getSimpleName() + " created");
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
        return this.getClass().getSimpleName() + "{"
                + "name='" + name + '\''
                + ", value='" + value + '\''
                + '}';
    }
}
