package day3;

import java.util.ArrayList;
import java.util.List;

public class Lab03 {
    public static void main(String[] args) {

        List<String> arr = new ArrayList<String>(List.of("mid"));

        System.out.println("ArrayList before insertion: " + arr);
//        Thêm vào đầu mảng ArrayList
        insertHead(arr, "head");
        System.out.println("ArrayList after insertion head: " + arr);

//        Thêm vào cuối mảng ArrayList
        insertTail(arr, "tail");
        System.out.println("ArrayList after insertion tail: " + arr);

    }
    public static void insertHead(List<String> list, String item) {
        list.add(0, item);
    }
    public static void insertTail(List<String> list, String item) {
        list.add(item);
    }

}
