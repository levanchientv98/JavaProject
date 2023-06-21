package day3;


import java.util.ArrayList;
import java.util.List;

//#### Bài 2: Viết hàm cho phép lấy phần tử đầu và cuối của 1 ArrayList cho trước
public class Lab02 {
    public static void main(String[] args) {

        List<String> arr01 = new ArrayList<String>(List.of("a", "b", "c"));
        List<String> arr02 = new ArrayList<String>(List.of("a"));

        takeFirst(arr01);
        takeLast(arr01);

        takeFirst(arr02);
        takeLast(arr02);

    }
    public static void takeFirst(List<String> arr){
        String first = arr.get(0);
        System.out.println("Lấy phần tử đầu tiên: " +first);
    }

    public static void takeLast(List<String> arr){
        String last = arr.get(arr.size()-1);
        System.out.println("Lấy phần tử cuối cùng: " +last);
    }

}
