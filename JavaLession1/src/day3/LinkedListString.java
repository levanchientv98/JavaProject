package day3;

import java.util.LinkedList;

public class LinkedListString {
    public static void main(String[] args) {
        System.out.println("\n\nLinkedList");

//        Crete a LinkedList to store strings
        LinkedList<String> names = new LinkedList<>();

//        Add element to the LinkedList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

//        Get the size of the LinkedList
        int size6 = names.size();
        System.out.println("Size of the LinkedList: " +size6);

//        Access elements in the LinkedList
        String frist = names.getFirst();
        String last = names.getLast();
        System.out.println("First element: "+frist);
        System.out.println("Last element: " +last );

//        Modify elements in the LinkedList
        names.set(1, "Eve");
        System.out.println("Modified LinkedList: " + names);

//        Iterate over the elements in the LinkedList
        System.out.println("Elements in the LinkedList: ");
        for(String name : names){
            System.out.println(name);
        }

//        Remove an element from the LinkedList
        boolean removed6 =names.remove("Charlie");
        System.out.println("Is Charlie removed? " +removed6);
        System.out.println("Updated LinkList: " +names);

//        Check if the LinkedList contains a specific element
        boolean contains6 = names.contains("Bob");
        System.out.println("Does the LinkedList contain Bob?");

    }
}
