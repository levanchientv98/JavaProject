package day5OOP;

public class SportCar2 implements Car2 {
    private String brand;

    public SportCar2(String brand){
        this.brand =brand;
    }

    @Override
    public void start() {
        System.out.println(brand + "sports car is starting with a roar!");
    }

    @Override
    public void stop() {
        System.out.println(brand +" sports car has stopped.");
    }

    @Override
    public void drive(double distance) {
        System.out.println(brand + " sports car is driving for" +distance+ "kilometers.");
    }
}
