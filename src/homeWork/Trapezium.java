package homeWork;

public class Trapezium extends Shape{
    private int c;
    private int d;

    public Trapezium(int c, int d) {
        this.c = c;
        this.d = d;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public double getPerimeter(int a, int b) {
        return a+b+this.c+this.d;
    }
}
