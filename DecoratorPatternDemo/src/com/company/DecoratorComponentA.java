package com.company;

/**
 * 装饰类A
 */
public class DecoratorComponentA extends DecoratedComponent{
    private DecoratedComponent decoratedComponent;
    @Override
    public void method() {
        System.out.println("对DecoratedComponent类的method方法进行包装");
        decoratedComponent.method();
        System.out.println("包装结束");
    }
    public void methodA(){
        System.out.println("装饰类A扩展方法 methodA()");
    }

    public DecoratorComponentA(DecoratedComponent decoratedComponent) {
        this.decoratedComponent = decoratedComponent;
    }
}
