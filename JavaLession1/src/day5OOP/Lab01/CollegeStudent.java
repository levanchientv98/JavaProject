package day5OOP.Lab01;

public class CollegeStudent extends Student implements Activity{
    private String collegeStudentID;
    public CollegeStudent(String collegeStudentID, String name, String gender, int age, double GPA) {
        super(name, gender, age, GPA);
        this.collegeStudentID = collegeStudentID;
    }

    @Override
    public void display() {
        System.out.println("Mã sinh viên cao đẳng: "+collegeStudentID);
        super.display();
    }
}
