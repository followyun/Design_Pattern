package com.company.standard;

/**
 */
public class Demo {
    public static void createObjectByBuilder() {
       Builder builder = new ConcreteBuilder();
       Director director = new Director(builder);
       director.constract();
    }
}
