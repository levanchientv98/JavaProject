package day6LabOOP.Lab01;

public class Manager extends Employee {
    private String department;
    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department =department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.3 ;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Phòng ban: "+ getDepartment());
    }
}
