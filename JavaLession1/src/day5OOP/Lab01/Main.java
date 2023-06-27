package day5OOP.Lab01;


public class Main {
    public static void main(String[] args) {
        Student student1 = new CollegeStudent("CD1","Tâm","Nữ",22,9);
        Student student2 = new CollegeStudent("CD2","Long","Nam",20,8);
        Student student3 = new UniversityStudent("DH1","Son","Nam",23,8);
        student1.display();
        student2.display();
        student3.display();

    }
}
