package com.aop.spring_aop_xml;

public class Rect {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void showResult() {
        System.out.println("넓이 : " + (width * width));
        System.out.println("둘레 : " + (2 * (width + height)));
    }
}