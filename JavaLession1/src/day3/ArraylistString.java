package day3;

import java.util.List;

public class ArraylistString {
    public static void main(String[] args) {
        List<String> fruits =new java.util.ArrayList<>();
//        Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

//        Get the size of the list
        int size1 = fruits.size();
        System.out.println("Size of the list: "+ size1);

//        Access elements in the list
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " +firstFruit);

//        Modify elements in the list
        fruits.set(1, "Mango");
        System.out.println("Modified list: " +fruits);

        System.out.println("Elements in the list: ");
        for(String fruit : fruits){
            System.out.println(fruit);
        }

//        Remove an element from the list
        boolean removed1 = fruits.remove("Orange");
        System.out.println("Is 'Orange' removed? " +removed1);
        System.out.println("Update list: " + fruits);

//        Check if the list contains a specific element
        boolean contains = fruits.contains("Banana");
        System.out.println("Does the list contain 'Banana' ? "+contains);

//       Clear all elements from the list
        fruits.clear();
        System.out.println("Size of the list affter clearing: "+fruits.size());
    }
}
