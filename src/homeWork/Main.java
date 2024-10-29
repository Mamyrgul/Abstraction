package homeWork;

public class Main {
    public static void main(String[] args) {
       /* public abstract double getPerimeter()
        деген абстракт методун  Shape деген класска кошунуз.
                Ал методту ишке ашырган 5 мурастоочу класс тузунуз жана методту ишке ашырыныз.*/

     Shape rhombus = new Rhombus();
        System.out.println("Периметр ромба: "+rhombus.getPerimeter(12,13));
        Shape square = new Square();
        System.out.println("Периметр квадрата: "+square.getPerimeter(9,2));
        Shape triangle= new Triangle(4);
        System.out.println("Периметр триугольника: "+triangle.getPerimeter(4,5));
        Shape rectangle= new Rectangle();
        System.out.println("Периметр прямоугольника: "+rectangle.getPerimeter(5,6));
        Shape trapezium = new Trapezium(3,2);
        System.out.println("Периметр трапеция: "+trapezium.getPerimeter(5,2));




    }
}
