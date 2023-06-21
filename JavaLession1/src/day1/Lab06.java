package day1;

public class Lab06 {
    //    Từ 80 - 100 tương ứng thang điểm A
    //    Từ 60 - 79 tương ứng thang điểm B
    //    Từ 40 - 59 tương ứng thang điểm C
    //    Từ 20 - 39 tương ứng thang điểm D
    //    Từ 0 - 19 tương ứng thang điểm E
    public static void main(String[] args) {
//        evaluate(47);
//        System.out.println("Kết quả so sánh: " +compare( 45, 45));
//        System.out.println("Năm nhuận là 0, ko nhuận là 1: " +isLeapYear(2016));
//        System.out.println("Tất cả  số chẵn đến n: ");printEven(45);
//        pyramid(10);

         printArray2D(mul(new int[][] { {1,2}, {1,2} }, new int[][] { {2,1}, {2,1} }));

    }

    static void evaluate(int score) {
        String result = "";
        if (score >= 0 && score <= 19) {
            result = "E";
        }
        if (score >= 20 && score <= 39) {
            result = "D";
        }
        if (score >= 40 && score <= 59) {
            result = "C";
        }
        if (score >= 60 && score <= 79) {
            result = "B";
        }
        if (score >= 80 && score <= 100) {
            result = "A";
        }
        System.out.println("Thang điểm: " + result);
    }

    //    #### 2. Tạo 1 method so sánh 2 số nguyên, trả về -1 nếu a < b, trả về 0 nếu a == b và 1 nếu a > b
   static int compare(int a, int b) {
        int result = 0;
        if(a < b) {
            return result = -1;
        }
        if(a > b){
            return  result = 1;
        }
        return  result;
    }

    //#### 3. Tạo 1 method nhận vào 1 số nguyên dương, số này tương ứng với năm (year), trả về 1 nếu số này thuộc về năm nhuận và 0 nếu ngược lại.
    static int isLeapYear(int year) {
        if(year % 4 == 0){
            return 0;
        }
        return 1;
    }

    //#### 4. Tạo hàm nhập và 1 số nguyên, in ra tất cả các số chẵn bắt đầu từ 0
    static void printEven(int n) {
        for (int i = 1; i <= n; i++ ){
            if(i % 2 == 0){
                System.out.print("\t"+i);
            }
        }
    }

    //#### 5. Vẽ kim tự thp: áTạo hàm nhập vào số n, in ra kim tự tháp có n tầng
    static void pyramid(int c) {
        for (int i = 0; i <= c; ++i) {
            int num = i;
            for (int j = 1; j <= i; ++j) {
                System.out.print(num);
            }
            System.out.println();
        }

        /// write your own implementation
    }

   //    #### 6. Nhân 2 ma trận 2x2
    static int[][] mul(int[][] x, int[][] y) {
        int rows1 = x.length;
        int cols1 = x[0].length;
        int cols2 = y[0].length;

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += x[i][k] * y[k][j];
                }
            }
        }

        return result;
    }
    public static void printArray2D(int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }




}
