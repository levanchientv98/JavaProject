package day3;

import java.util.ArrayList;
import java.util.List;

public class Lab05 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<String>(List.of("x", "y", "z"));
        List<Integer> trans = transform(arr);
        System.out.println(trans);

    }
    public static List<Integer> transform(List<String> arr) {
        List<Integer> location = new ArrayList<Integer>();
        for (int i = 0; i < arr.size();i++ ){
            location.add(i);
        }
        return location;
    }

}
