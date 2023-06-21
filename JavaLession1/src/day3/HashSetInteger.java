package day3;

import java.util.HashSet;
import java.util.Set;

public class HashSetInteger {
    public static void main(String[] args) {
        System.out.println("\n\nHashSet - Integer");

        //Create a HashSet
        Set<Integer> numbers7 =new HashSet<>();

//        Add elements to the set
        numbers7.add(10);
        numbers7.add(20);
        numbers7.add(30);
        numbers7.add(20);
//        Duplicate elements are igored

//        get the size of the set
        int size7= numbers7.size();
        System.out.println("Size of the set: " +size7);

//        Iterate over the elements in the set
        System.out.println("Elements in the set: ");
        for(int number7 : numbers7){
            System.out.println(number7);
        }

//      remove an element from the set
        boolean removed7 =numbers7.remove(20);
        System.out.println("Is 20 removed? "+removed7);
        System.out.println("Update HashSet: " +numbers7);

//        Check if the HashSet contains a specific element
        boolean contains7= numbers7.contains(10);
        System.out.println("Does the HashSet contain 10? " +contains7);

//        clear all elements from the HashSet
        numbers7.clear();
        System.out.println("Size of the HashSet after clearing: " +numbers7.size());

    }
}
