package day3;

import java.util.*;

public class Lab1JavaCollection {
    public static void main(String[] args) {
        System.out.println("Collecton");
        Collection<Integer> numbers = new ArrayList<>();
//      Add elements to the collection
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
//        Get the size of the collection
        int size = numbers.size();
        System.out.println("Size of the collection: " + size);

//        Check  if the collections is empty
        boolean isEmpty =numbers.isEmpty();
        System.out.println("Is the collection empty? "+isEmpty);

//        Iterate over the elements in the collection
        System.out.println("Elements in the collection:");
        for (int number : numbers){
            System.out.println(number);
        }

//        Remove an element from the collection
        boolean removed =numbers.remove(20);
        System.out.println("Is 20 removed? " +removed);

//    Clear all elements from the collection
        numbers.clear();
        System.out.println("Size of the collection after clearing: "+numbers.size());

        System.out.println("\n\nArrayList");

    }

}
