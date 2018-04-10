package com.company.my;

/**
 * window的构造者
 */
public class WindowBuilder {
    private int x = 1;
    private int y = 1;
    private String title = "untitled";
    private int width = 1;
    private int height = 1;

    public Window build() {
        Window window = new Window();
        window.setX(x);
        window.setHeight(height);
        window.setY(y);
        window.setWidth(width);
        window.setTitle(title);
        return window;
    }

    public WindowBuilder x(int x) {
        this.x = x;
        return this;
    }

    public WindowBuilder y(int y) {
        this.y = y;
        return this;
    }

    public WindowBuilder title(String title) {
        this.title = title;
        return this;

    }

    public WindowBuilder width(int width) {
        this.width = width;
        return this;

    }

    public WindowBuilder height(int height) {
        this.height = height;
        return this;

    }
}
