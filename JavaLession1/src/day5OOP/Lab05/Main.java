package day5OOP.Lab05;

public class Main {
    public static void main(String[] args) {
        Employee nv1 = new Manager("LongGPT", 6000, "ProjectManager", 150);
        nv1.display();
        Employee nv2 = new Developer("SonGPT", 6000, "Senior", 200);
        nv2.display();
        Employee nv3 = new Salesperson("Chien", 6000, "SalesSpecialist", 250);
        nv3.display();

    }
}
