package com.galaxy.red.hat.demo.javaswingpuremvcdemo.model;

public class AppSettingsManagerVO {
    private int x, y;
    private int width;
    private int height;

    public AppSettingsManagerVO() {
        x = 400;
        y=200;
        width=400;
        height=300;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

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




}
