package day5OOP.Lab02;

public class Main {
    public static void main(String[] args) {
        Shape circle1 = new Circle(6.5);
        System.out.println("Chu vi hình tròn: "+circle1.calculatePerimeter());
        System.out.println("Diện tích hình tròn: "+circle1.calculateArea());
        Shape rectangle1 = new Rectangle(8,5);
        System.out.println("Chu vi hình chữ nhật: "+rectangle1.calculatePerimeter());
        System.out.println("Diện tích hình chữ nhật: "+rectangle1.calculateArea());
        Shape triangle1 = new Triangle(7, 6 ,4);
        System.out.println("Chu vi tam giác: "+triangle1.calculatePerimeter());
        System.out.println("Diện tích tam giác: "+triangle1.calculateArea());
    }
}
