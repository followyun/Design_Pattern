package com.company.standard;

/**
 * 导演类，负责调度指定的建造者不同的生成属性方法
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product constract() {

        builder.buildA();
        builder.buildC();
        builder.buildB();
        return builder.getResult();
    }
}
