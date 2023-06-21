package day3;

import java.util.HashSet;
import java.util.Set;

public class HashSetString {
    public static void main(String[] args) {
        System.out.println("\n\nHashSet - String");

        //Create a HashSet
        Set<String> fruits2 =new HashSet<>();

//        Add elements to the set
        fruits2.add("Apple");
        fruits2.add("Banana");
        fruits2.add("Orange");
//        fruits2.add("Apple");
//        Duplicate elements are igored

//        get the size of the set
        int size2= fruits2.size();
        System.out.println("Size of the set: " +size2);

//        Check if an element exists in the set
        boolean containsApple = fruits2.contains("Apple");
        System.out.println("Does the set contain 'Apple ?" +containsApple);

//        Iterate over the elements in the set
        System.out.println("Elements in the set: ");
        for(String fruit2 : fruits2){
            System.out.println(fruit2);
        }

//      remove an element from the set
        boolean removed2 =fruits2.remove("Orange");
        System.out.println("Is 'Orange' removed? "+removed2);

//        clear all elements from the set
        fruits2.clear();
        System.out.println("Size of the set after clearing: " +fruits2.size());

    }
}
