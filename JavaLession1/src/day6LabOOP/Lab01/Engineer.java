package day6LabOOP.Lab01;

public class Engineer extends Employee{
    private String skill;

    public Engineer(String name, double salary, String skill) {
        super(name, salary);
        this.skill =skill;
    }

    public String getSkill() {
        return skill;
    }

    @Override
    public double calculateBonus() {
        return getSalary()* 0.8;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Skill: "+getSkill());
        System.out.println("Salary: " + (getSalary()+calculateBonus())+"$");

    }
}
