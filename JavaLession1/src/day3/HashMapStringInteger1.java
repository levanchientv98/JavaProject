package day3;

import java.util.HashMap;
import java.util.Map;

public class HashMapStringInteger1 {
    public static void main(String[] args) {
        System.out.println("\n\nHashMap");
//        Create a Map to store student names and their corresponding IDs
        Map<String, Integer> studentMap = new HashMap<>();

//        Add elements to the HashMap
        studentMap.put("Alice", 1001);
        studentMap.put("Bob",1002);
        studentMap.put("Charlie", 1003);

//        Get the size of the HashMap
        int size8 = studentMap.size();
        System.out.println("Size of the HashMap: "+size8);

//        Access elements in the map
        int aliceId= studentMap.get("Alice");
        System.out.println("Alice's ID: "+aliceId);

//        Check if the map contains a specific key
        boolean containsKey = studentMap.containsKey("Bob");
        System.out.println("Does the HashMap contain key 'Bob'? "+containsKey);

//      Check if the HashMap contains a specific value
        boolean containsValue = studentMap.containsValue(1004);
        System.out.println("Does the HashMap contain value 1004? " +containsValue);

//        Iterate over the elements in the HashMap
        System.out.println("Elements in the HashMap: ");
        for (Map.Entry<String, Integer> entry: studentMap.entrySet()){
            String name =entry.getKey();
            int id =entry.getValue();
            System.out.println("Name: " +name+" , ID: "+id);
        }

//        Remove an element from the HashMap
        Integer removeId1 =studentMap.remove("Bob");
        System.out.println("Remove ID: "+removeId1);
        System.out.println("Update map: " +studentMap);

//        Clear all elements from the HashMap
        studentMap.clear();
        System.out.println("Size of the HashMap after clearing: "+studentMap.size());
    }
}
