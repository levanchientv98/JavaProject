package day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListInteger1 {
    public static void main(String[] args) {
        System.out.println("\n\nUtility-Classes");
//        create a list if integers
        List<Integer> numbers9 = new ArrayList<>();
        numbers9.add(5);
        numbers9.add(2);
        numbers9.add(8);
        numbers9.add(1);
        numbers9.add(10);

//        Use Collections utility methods
        System.out.println("Original list: " +numbers9);

//        Sort the list in ascending order
        Collections.sort(numbers9);
        System.out.println("Sorted list (ascending): "+ numbers9);

//        Reverse the order of the list
        Collections.reverse(numbers9);
        System.out.println("Reversed list: " +numbers9);

//        Shuffle the element in the list
        Collections.shuffle(numbers9);
        System.out.println("Shuffled list: " +numbers9);

//        Find the minimum and maximum elements in the list
        Integer min = Collections.min(numbers9);
        Integer max = Collections.max(numbers9);
        System.out.println("Minimum element: " +min);
        System.out.println("Maximum element: " +max );

//        Replace all occurrences of a specific element in the list
        Collections.replaceAll(numbers9, 5,9);
        System.out.println("List after replacing 5 with 9 " + numbers9);
    }
}
