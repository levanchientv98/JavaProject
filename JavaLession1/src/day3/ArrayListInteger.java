package day3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInteger {
    public static void main(String[] args) {
        System.out.println("\n\nArrayList Interger");
//        create an ArrayList to store integers
        List<Integer> numbers5 =new ArrayList<>();

//        Add elements to the ArrayList
        numbers5.add(10);
        numbers5.add(20);
        numbers5.add(30);

//        Get the size of the ArrayList
        int size5 = numbers5.size();
        System.out.println("Size of the ArrayList: " +size5);

//        Access elements in the ArrayList
        int firstNumber = numbers5.get(0);
        System.out.println("First number: " +firstNumber);

//        Modify elements in the ArrayList
        numbers5.set(1,25);
        System.out.println("Modified ArrayList: "+numbers5);

//        Iterate over the elements in the ArrayList
        System.out.println("Elements in the ArrayList: ");
        for (int number5 : numbers5){
            System.out.println(number5);
        }

//        Remove an element from th ArrayList
        boolean removed5 = numbers5.remove(Integer.valueOf(30));
        System.out.println("Is 30 remove? " +removed5);
        System.out.println("Updated ArrayList: " +numbers5);

//        Check if the ArrayList contain a specific element
        boolean contains5 = numbers5.contains(20);
        System.out.println("Does the ArrayList contain 20? " +contains5);

//        Clear all elements from the ArrayList
        numbers5.clear();
        System.out.println("Size of the ArrayList after clearing: "+numbers5.size());
    }
}
