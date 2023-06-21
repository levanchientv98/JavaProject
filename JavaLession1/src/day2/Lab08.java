package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab08 {
    public static void main(String[] args) {
//        Câu1
//        System.out.println("các ký tự trùng nhau: "+Arrays.toString(dedupe("abca")));
//        System.out.println("các ký tự trùng nhau: "+Arrays.toString(dedupe("abcd")));
//        System.out.println("các ký tự trùng nhau: "+Arrays.toString(dedupe("abcdac")));
//        System.out.println("các ký tự trùng nhau: "+Arrays.toString(dedupe("abcde")));
//        System.out.println("các ký tự trùng nhau: "+Arrays.toString(dedupe("")));

//        Câu 2
//        System.out.println(findChar("LOngSonGTA",5));

//        Câu3
        System.out.println(replace("Local Host Server IP is {}", "127.0.0.1"));
        System.out.println(replace("{} love his dog, {} prepare to take him out for walking", "Nick"));
        System.out.println(replace("lorem isum",""));


//        int[] arr = {1, 2, 3, 6, 4};
//        int[][] result = groupBy(arr);
//        String formattedArray = formatTwoArray(result);
//        System.out.println(formattedArray);

    }

    //Java Basic: String Challenges
    //  Câu  1. Tìm các chữ cái trùng nhau có trong 1 chuỗi
    static String[] dedupe(String str) {
        char[] a = str.toCharArray();
        String[] arr = {};
        // Chuyển đổi chuỗi thành chữ cái viết thường để loại bỏ sự phân biệt chữ hoa/chữ thường
        str = str.toLowerCase();
        List<String> testList = new ArrayList<>(Arrays.asList(arr));
        // Khởi tạo một mảng đếm có độ dài bằng số lượng chữ cái trong bảng chữ cái tiếng Anh
        int[] charCount = new int[26];
        // Duyệt qua từng ký tự trong chuỗi
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Kiểm tra nếu ký tự là một chữ cái
            if (Character.isLetter(ch)) {
                // Tăng giá trị đếm của ký tự tương ứng trong mảng
                charCount[ch - 'a']++;
            }
        }
        // In các chữ cái trùng nhau có đếm > 1
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                char ch = (char) (i + 'a');
                testList.add(0, "" + ch);
            }
        }
        arr = testList.toArray(new String[0]);

        return arr;
    }

    //    Câu 2 Tìm và trả về ký tự ở vị trí nhập vào
    static char findChar(String str , int location) {
        if(location < 0 ){
            System.out.println("Lỗi vị trí trong chuỗi không thể âm");
        }
        char a = str.charAt(location);
        return a;
    }
//    Câu 3 Tìm và thay thế {} trong chuỗi
    static String replace(String str, String param) {
        if(param == ""){
            return str;
        }
        return str.replace("{}",param);
    }

//  Câu 4 Tạo hàm nhận vào không giới hạn 1 danh sách các String, trả về kết quả sau khi nối chuỗi





    //    Java Basic: Array Challenges
// Câu 1:Tạo hàm nhận đầu vào là 1 chuỗi các số nguyên, trả ra mảng 2 chiều gồm 2 phần tử
    static int[][] groupBy(int[] arr) {
        int[][] newArr = {{}, {}};
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            integerList.add(arr[i]);
        }
        // Tạo danh sách để lưu số chẵn và số lẻ
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        // Lặp qua từng số nguyên và đưa vào danh sách tương ứng
        for (int number : integerList) {
            if (number % 2 == 0) {
                evenList.add(number);
            } else {
                oddList.add(number);
            }
        }
        // Khởi tạo mảng hai chiều với hai phần tử
        int[][] result = new int[2][];
        result[0] = new int[evenList.size()];
        result[1] = new int[oddList.size()];

        // Chuyển đổi danh sách số chẵn và số lẻ thành mảng
        for (int i = 0; i < evenList.size(); i++) {
            result[0][i] = evenList.get(i);
        }

        for (int i = 0; i < oddList.size(); i++) {
            result[1][i] = oddList.get(i);
        }

        return result;
    }

    //    Format print array 2
    public static String formatTwoArray(int[][] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(Arrays.toString(array[i]));
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
