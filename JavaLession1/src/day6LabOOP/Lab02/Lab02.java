package day6LabOOP.Lab02;

import java.util.Arrays;
import java.util.List;

public class Lab02 {
    public static void main(String[] args) {
        Library tv1 = new Library("Thư viện 1");
        Book b1 = new Book("Dragon Ball","manga","Kaizu",5);
        Book b2 = new Book("Nhà giả kim","Tiểu thuyết","Paulo Coelho",20);
        Book b3 = new Book("Tuổi trẻ đáng giá 15k","Văn học Việt","Rosie Nguyễn",15);
        tv1.addBook(b1);
        tv1.addBook(b2);
        tv1.addBook(b3);
        tv1.addBook(b3);
        System.out.println( tv1.getBooks().toString());
        Member member1 = new Member("Lê Chiến");
        member1.brrow(b1,tv1,5);
        member1.brrow(b3,tv1,3);
        System.out.println( tv1.getBooks().toString());
        member1.brrow(b1,tv1,5);
        member1.bookBack(b1,tv1,3);
        System.out.println( tv1.getBooks().toString());
        tv1.removeBook(b3);
        System.out.println( tv1.getBooks().toString());





    }
}
