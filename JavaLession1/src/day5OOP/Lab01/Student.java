package day5OOP.Lab01;

public class Student implements Activity {
    private String name;
    private String gender;
    private int age;
    private double GPA;

    public Student(String name, String gender, int age,  double GPA) {
        this.name = name;
        this.gender =gender;
        this.age = age;
        this.GPA = GPA;
    }

    @Override
    public void display() {
        System.out.println("Tên sinh viên: " +name);
        System.out.println("Giới tính: " +gender);
        System.out.println("Tuổi: " +age);
        System.out.println("GPA: " +GPA);
    }
}
