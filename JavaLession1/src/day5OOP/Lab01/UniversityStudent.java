package day5OOP.Lab01;

public class UniversityStudent extends Student implements Activity {
    private String universityStudentID;
    public UniversityStudent(String universityStudentID,String name, String gender, int age, double GPA) {
        super(name, gender, age, GPA);
        this.universityStudentID = universityStudentID;
    }

    @Override
    public void display() {
        System.out.println("Mã sinh viên đại học: "+universityStudentID);
        super.display();
    }
}
