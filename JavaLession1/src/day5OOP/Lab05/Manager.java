package day5OOP.Lab05;

public class Manager extends Employee{
    String position;
    int workingHour;
    public Manager(String name, double salary, String position, int workingHour) {
        super(name, salary);
        this.position = position;
        this.workingHour =workingHour;
    }
    public double totalSalary(){
        return this.getSalary()*6*workingHour;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Lương: "+totalSalary()+"$");
        System.out.println("Vị trí làm việc: "+position);
    }
}
