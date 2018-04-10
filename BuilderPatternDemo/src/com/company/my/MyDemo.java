package com.company.my;

/**
 */
public class MyDemo {

    public static void createObjectByBuilder() {
        Window window = new WindowBuilder()
                .title("主界面")
                .build();
        System.out.println(window.getX());
        System.out.println(window.getY());
        System.out.println(window.getTitle());
        System.out.println(window.getWidth());
        System.out.println(window.getHeight());
    }
}
