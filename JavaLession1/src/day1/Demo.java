package day1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        String myNumberStr ="123";
//        Integer myNumber = Integer.parseInt(myNumberStr);
//        System.out.println("My Number: " + myNumber);

//        int num = 5;
//        if(num > 0){
//            System.out.println("The number is positive.");
//        }else if(num < 0){
//            System.out.println("The number is negative.");
//        }else {
//            System.out.println("The number í zero ");
//        }

//        demo Switch case
//        System.out.print("Chọn ngày: ");
//        int dayOfWeek = sc.nextInt();
//        String dayName;
//        switch (dayOfWeek) {
//            case 1:
//                dayName = "Monday";
//                break;
//            case 2:
//                dayName = "Tuesday";
//                break;
//            case 3:
//                dayName = "Wednesday";
//                break;
//            case 4:
//                dayName = "Thursday";
//                break;
//            case 5:
//                dayName = "Friday";
//                break;
//            case 6:
//                dayName = "Saturday";
//                break;
//            case 7:
//                dayName = "Sunday";
//                break;
//            default:
//                dayName = "Invalid day";
//                break;
//        }
//        System.out.println("The day is: " + dayName);

//        Syntax: for
//        for(int i = 1; i<=5; i++){
//            System.out.println("Iteration: " +i);
//        }

//        Syntax: while
//        int i = 1;
//        while (i <= 5){
//            System.out.println("Iteration: " +i);
//            i++;
//        }

//        Syntax: do While
//        int count = 1;
//        do {
//            System.out.println("Count: "+count);
//            count++;
//        }while (count <= 5);

//        Example for
//                for(int i = 1; i<= 10; i++){
//                    if(i==5){
//                        break;
//                    }
//                    System.out.println("Iterration: " +i);
//                }


//        Example for
//        for(int i = 1; i<= 10; i++){
//            if(i==5){
//                continue;
//            }
//            System.out.println("Iterration: " +i);
//        }

//        Example retunr in loop
//        int[] numbers = {3,9,4,7,2,6};
//        int result = day1.Demo.findFirstEvenNumber(numbers);
//        System.out.printf("First even number:" +result);

    }
//    Method indFirstEvenNumber
    public static int findFirstEvenNumber(int[] numbers){
        for (int num : numbers) {
                if(num % 2 == 0 ){
                    return num;
                }
            }
        return  -1;
        }
    }
