package day5OOP;

public class Sedan implements Car2{
    private String brand;

    public Sedan(String brand) {
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println(brand + " sedan is starting smoothly.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " sedan has come to stop.");
    }

    @Override
    public void drive(double distance) {
        System.out.println(brand + " sedan is driving for " +distance+ "kilometers.");
    }
}
