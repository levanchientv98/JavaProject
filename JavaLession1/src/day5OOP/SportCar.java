package day5OOP;

public class SportCar extends Car{
    private int price;
    public SportCar(String brand, String color, int price){
        super(brand, color);
        this.price =price;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Price: " +price);
    }

    @Override
    public void start() {
        System.out.println("Sport car is strarting with a roar!");
    }
}
