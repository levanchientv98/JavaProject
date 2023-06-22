package day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab02 {
    public static void main(String[] args) {
        System.out.println(dedupe("s s rt sa"));
    }
//    #### 1. Tìm các và trả về danh sách các ký tự không trùng nhau trong 1 String. Dùng HashMap để giải bài toán này.
    public static List<Character> dedupe(String str){
        Map<Character,Integer> countMap = new HashMap<>();
        for(char c : str.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        List<Character> uniqueCharacters = new ArrayList<>();
        // Lấy danh sách các ký tự không trùng nhau
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueCharacters.add(entry.getKey());
            }
        }

        return uniqueCharacters;
    }
// Câu 2:  Phân loại các số nguyên tố và các số không phải số nguyên tố
//    public static HashMap<String, List<Integer>> classifyPrime(List<Integer> nums) {
//        int temp;
//        for(int i = 2 ; i< nums.size()/2;i ++){
//            temp = nums.size()%i;
//        }
//    }

}
