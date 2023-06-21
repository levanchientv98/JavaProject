package day3;
//#### Bài 4: Viết hàm cho phép chuyển toàn bộ nội dung của 1 Array sang 1 Array còn lại

import java.util.ArrayList;
import java.util.List;

public class Lab04 {
    public static void main(String[] args) {
        List<String> left = new ArrayList<String>(List.of("x", "y"));
        List<String> right = new ArrayList<String>(List.of("z"));
        migrate(left, right);
    }
    public static void migrate(List<String> left, List<String> right) {
        right.addAll(left);
        left.clear();
        System.out.println(left);
        System.out.println(right);

    }
}
