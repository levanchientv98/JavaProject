package day5OOP.Lab05;

public class Developer extends Employee{
    String position;
    int workingHour;
    public Developer(String name, double salary, String position, int workingHour) {
        super(name, salary);
        this.position = position;
        this.workingHour =workingHour;
    }

    public double totalSalary(){
        return this.getSalary()*8*workingHour;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Lương: "+totalSalary() +"$");
        System.out.println("Vị trí làm việc: "+position);
    }
}
