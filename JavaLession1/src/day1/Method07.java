package day1;

import static java.lang.Math.sqrt;

public class Method07 {
    // Câu 1 Thực hiện phép chia 2 số
    static int divide(int a, int b){
        int result = 0;
        try {
            result = a / b;
        }catch (ArithmeticException ex){
            throw ex;
        }
        return result;
    }
    // Câu2. Method lấy ký tự đầu tiên của 1 String
    static void getFirstChar(String str){
        System.out.println("Kí tự đầu tiên của chuỗi "+ str + " là: " + str.charAt(0));
    }

    // Câu 3. Method kiểm tra 1 số có phải là số chẵn hay không
    static void checkEvenNumber(int a){
        if(a%2 ==0){
            System.out.println(a+" là số chẵn ");
        }else {
            System.out.println(a+" là số lẽ ");
        }
    }
    // Câu 4. Method tính tổng 2 kiểu dữ liệu có kiểu short
    static void sumShort(short a , short b){
        if(Short.MIN_VALUE >= a || a >= Short.MAX_VALUE || Short.MIN_VALUE >= b || b >= Short.MAX_VALUE ){
            System.out.println("Vì a,b có kiểu dữ liệu Short nhập a và b trong miền giá trị từ: "+Short.MIN_VALUE+ " đến " +Short.MAX_VALUE);
        }else
        {
            short total = (short) (a + b);
            System.out.println(a+" + " +b+ " = " +total);
        }

    }
    // Câu 5. Method tính Factorial (nhập vào số nguyên)
    static int factorial(int a){
        if(a==0){
            return 1;
        }
        return a * factorial(a-1);
    }
    // Câu 6. Method tính trung bình cộng
    static void avg(int[] n){
        int result = 0;
        for(int i = 0; i < n.length; i++){
            result = result + n[i];
        }
        System.out.println("Trung bình các số là: "+ (result/n.length));
    }
    // Câu 7 Tìm giá trị lớn nhất của 2 số (tham số là 2 số có kiểu Integer)
    static int maxInterge(int a , int b){
        int max = a;
        if(a < b){
            max = b;
        }
        return max;
    }
    //  Câu 8 Tính cạnh huyền của một tam giác vuông (tham số là 2 cạnh góc vuông)
    static void countHypotenuse(double a,double b){
        if(a > 0 && b > 0 ){
            System.out.println("tam giác vuông có cạnh a = "+ a+" cạnh b = " +b +" cạnh huyền = "+sqrt(a*a +b*b));
        }else {
            System.out.println("Vì là tam giác a và b phải lớn 0");
        }
    }

    //  Câu 9 Method lấy ra ký tự cuối cùng của 1 String
    static void getLastChar(String n){
        System.out.println("Kí tự cuối cùng của chuỗi" +n+ " là " +n.charAt(n.length()-1));
    }
    // Câu 10 Bài toán vẽ kim tự tháp bằng java?
    static void drawPyramid(int hight){
        for (int i = 1; i <= hight; i++) {

            for (int j = 1; j <= hight - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
