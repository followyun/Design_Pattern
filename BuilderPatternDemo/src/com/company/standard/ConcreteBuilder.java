package com.company.standard;

/**
 * 具体的建造类
 */
public class ConcreteBuilder extends Builder{
    @Override
    public void buildA() {
        System.out.println("构造属性A");
    }

    @Override
    public void buildB() {
        System.out.println("构造属性B");

    }

    @Override
    public void buildC() {
        System.out.println("构造属性C");

    }

    @Override
    public void buildD() {
        System.out.println("构造属性D");

    }

    @Override
    public Product getResult() {
        return null;
    }
}
