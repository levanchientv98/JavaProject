package day3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueIF {
    public static void main(String[] args) {
        System.out.println("\n\nQueue");

//        Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

//        Add elements to the queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");

//        Get the size of the queue
        int size3 = queue.size();
        System.out.println("Size of the queue: " +size3);

//        Check if the aueue is empty
        boolean isEmpty3 = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty3);

//        Access the element at the front of the queue without removing it
        String forntElement = queue.peek();
        System.out.println("Front element of the  queue: " +forntElement);

//        Process elements in the queue (remove them)
        while ((!queue.isEmpty())){
            String element =queue.poll();
            System.out.println("Processing element: " +element);
        }

//        Check the size of the queue after processing
        System.out.println("Size of the queue after processing: " +queue.size());

    }
}
