package day6LabOOP.Lab05;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("S001", "John Smith");
        Student student2 = new Student("S002", "Jane Doe");

        Course course1 = new Course("C001", "Mathematics");
        Course course2 = new Course("C002", "Physics");

        StudentManagementSystem sms = new StudentManagementSystem();

        sms.addStudent(student1);
        sms.addStudent(student2);

        sms.addCourse(course1);
        sms.addCourse(course2);

        sms.enrollStudent(student1, course1);
        sms.enrollStudent(student1, course2);
        sms.enrollStudent(student2, course1);

        System.out.println("Enrollments:");
        for (Enrollment enrollment : sms.getEnrollments()) {
            System.out.println(enrollment.getStudent().getStudentName() + " - " + enrollment.getCourse().getCouresName());
        }
    }
}
