package com.company;

/**
 * 被修饰的具体类
 */
public class ConcreteComponent extends DecoratedComponent{
    @Override
    public void method() {
        System.out.println("ConcreteComponent执行method()方法！");
    }
}
