package com.company;

/**
 */
public class Demo {
    /**
     * 测试装饰器模式
     */
    public static void decoratorTest(){
        DecoratedComponent component = new ConcreteComponent();
        DecoratorComponentA componentA = new DecoratorComponentA(component);
        componentA.method();
        componentA.methodA();
    }

}
