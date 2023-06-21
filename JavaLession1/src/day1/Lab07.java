package day1;

import java.util.Scanner;

public class Lab07 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int result = Method07.divide(a,0);
            System.out.println("Result: "+result);
        }catch (ArithmeticException ex){
            System.out.println("Lỗi: Chia cho 0 không hợp lệ");
            System.out.println("Generic Exception: " + ex.getMessage());
        }finally {
            System.out.println("Cleanup code goes here");
        }
//        day1.Method07.getFirstChar("SonLongGPT");
//        day1.Method07.checkEvenNumber(9);
        Scanner sc =new Scanner(System.in);
        try {
            System.out.print("Vui lòng nhập một số nguyên: ");
            short a = sc.nextShort();
            short b = sc.nextShort();
            Method07.sumShort(a,b);
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi trong quá trình nhập liệu. Vui lòng thử lại." + e.getMessage());
        }

//        day1.Method07.sumShort(a, b);
//        int [] arr = {5, 6, 7};
//        day1.Method07.avg(arr);
//        day1.Method07.countHypotenuse(3, 4);
//        day1.Method07.getLastChar("LongSonGPT");
//        day1.Method07.drawPyramid(5);
    }


}
