package day6LabOOP.Lab01;

//1. Quản lý nhân viên: Xây dựng một hệ thống quản lý nhân viên, trong đó bạn cần tạo các lớp như Employee, Manager, và Engineer.
// Mỗi lớp sẽ có các thuộc tính và phương thức riêng, và sử dụng tính kế thừa để tái sử dụng mã.
public class Lab01
{
    public static void main(String[] args) {
        Employee nv1 = new Manager("Châu Sơn",1000,"IT");
        Employee nv2 = new Engineer("Hoàng Long ",1234,"Front-End");
        nv1.display();
        nv2.display();
    }
}
