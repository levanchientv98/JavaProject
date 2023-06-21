package day3;

//#### Bài 1: Viết hàm cho phép thêm ký tự vào đầu hoặc cuối của 1 LinkedList

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lab01LinkedList {
    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<>(List.of("mid"));

        System.out.println("ArrayList before insertion: " + arr);
//        Thêm vào đầu mảng ArrayList
        insertHead(arr, "head");
        System.out.println("ArrayList after insertion head: " + arr);

//        Thêm vào cuối mảng ArrayList
        insertTail(arr, "tail");
        System.out.println("ArrayList after insertion tail: " + arr);

        LinkedList<String> arr01 = new LinkedList<String>(List.of("a", "b", "c"));
        remove(arr01, 0);
        remove(arr01, 1);

        LinkedList<String> left = new LinkedList<>(List.of("x", "y"));
        LinkedList<String> right = new LinkedList<>(List.of("z"));
        migrate(left, right);

//        Câu 4
        LinkedList<String> arr04 = new LinkedList<String>(List.of("a", "b", "c"));
        System.out.println(arr04);
        System.out.println(reverse(arr04));

//        Câu 5
        LinkedList<String> arr05 = new LinkedList<String>(List.of("a", "b", "c"));
        replace(arr05, 1, "d");



    }

    //  Câu 1: Viết hàm cho phép thêm ký tự vào đầu hoặc cuối của 1 LinkedList
    public static void insertHead(LinkedList<String> list, String item) {
        list.add(0, item);
    }

    public static void insertTail(LinkedList<String> list, String item) {
        list.add(item);
    }

    //  Câu 2: Viết hàm cho phép xóa ký tự tại 1 ví trí nhập vào
    public static void remove(LinkedList<String> list, int index) {
        list.remove(index);
        System.out.println(list);
    }

    //   Câu 3: Viết hàm cho phép chuyển toàn bộ dữ liệu của mảng bên trái qua phải
    public static void migrate(LinkedList<String> left, LinkedList<String> right) {
        int size = left.size();
        for(int i= 0; i< size; i++){
            right.add(left.pop());
        }
//        right.addAll(left);
//        left.clear();
        System.out.println(left);
        System.out.println(right);

    }

//    Câu 4 Đảo ngược vị trí các phần tử trong 1 LinkedList
    public static List<String> reverse(LinkedList<String> arr) {
        LinkedList<String> mylist = new LinkedList<>();
        for(int i = arr.size()-1; i >= 0;i--){
            mylist.add(arr.get(i));
        }
//        Cách 2:
//        Collections.reverse(arr);
        return mylist;
    }

//    Câu 5: Thay thế 1 phần tử trong mảng bằng 1 phần tử mới
    public static void replace(LinkedList<String> arr,int pos, String newValue){
        arr.set(pos,newValue);
        System.out.println(arr);
    }



}
