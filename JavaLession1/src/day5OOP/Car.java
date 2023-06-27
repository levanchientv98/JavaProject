package day5OOP;

abstract class Car {
//    Instance viriables
    private String brand;
    private String color;
    private int year;

//    Constructor

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
//        this.year = year;
    }
//    Phương thức trừu tượng
    public abstract void start();
//    Methods
//    public  void start(){
//        System.out.println("The car is starting. ");
//    }

    public void drive(){
        System.out.println("The car is driving. ");
    }

    public void stop(){
        System.out.println("The car has stopped. ");
    }

    public void  displayInfo(){
        System.out.println("======== DISPLAY INFO ========");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
//        System.out.println("Year: " + year);
    }
}
