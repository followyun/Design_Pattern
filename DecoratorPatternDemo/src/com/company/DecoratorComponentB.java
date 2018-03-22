package com.company;

/**
 * 装饰类B
 */
public class DecoratorComponentB extends DecoratedComponent{
    private DecoratedComponent decoratedComponent;
    @Override
    public void method() {
        System.out.println("对DecoratedComponent类的method方法进行包装");
        decoratedComponent.method();
        System.out.println("包装结束");
    }
    public void methodB(){
        System.out.println("装饰类B扩展方法 methodA()");
    }

    public DecoratorComponentB(DecoratedComponent decoratedComponent) {
        this.decoratedComponent = decoratedComponent;
    }
}
