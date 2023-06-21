package day3;

import java.util.HashMap;
import java.util.Map;

public class HashMapStringInteger {
    public static void main(String[] args) {
        System.out.println("\n\nHashMap");
//        Create a Map to store student names and their corresponding IDs
        Map<String, Integer> studentIds = new HashMap<>();

//        Add elements to the map
        studentIds.put("John", 101);
        studentIds.put("Alice",102);
        studentIds.put("Bob", 103);

//        Get the size of the map
        int size4 = studentIds.size();
        System.out.println("Size of the map: "+size4);

//        Access elements in the map
        int johnId= studentIds.get("John");
        System.out.println("John's ID: "+johnId);

//        Check if the map contains a specific key
        boolean containAlice = studentIds.containsKey("Alice");
        System.out.println("Does the map contain Alice? "+containAlice);

//        Iterate over the elements in the map
        System.out.println("Elements in the map: ");
        for (Map.Entry<String, Integer> entry: studentIds.entrySet()){
            String name =entry.getKey();
            int id =entry.getValue();
            System.out.println("Name: " +name+" , ID: "+id);
        }

//        Remove an element from the map
        Integer removeId =studentIds.remove("Bob");
        System.out.println("Remove ID: "+removeId);
        System.out.println("Update map: " +studentIds);

//        Clear all elements from the map
        studentIds.clear();
        System.out.println("Size of the map after clearing: "+studentIds.size());
    }
}
