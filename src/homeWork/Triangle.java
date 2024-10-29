package homeWork;

import java.util.Scanner;

public class Triangle extends Shape{
    private int c;

    public Triangle(int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public double getPerimeter(int a, int b) {
        return a+b+this.c;
    }
}
