package day5OOP;

public class Main {
    public static void main(String[] args) {
        Car car = new SportCar("Audi","red",1000);
        car.start();
        car.displayInfo();
        car.stop();

        Car2 sedan = new Sedan("Toyota");
        sedan.start();
        sedan.drive(80);
        sedan.stop();

    }
}
