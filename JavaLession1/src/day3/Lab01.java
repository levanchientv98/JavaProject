package day3;

import java.util.ArrayList;
import java.util.List;

public class Lab01 {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>();

//        Add elements to the ArrayList
        mylist.add(10);
        mylist.add(20);
        mylist.add(30);

        for(int i = 0; i<mylist.size(); i++){
            Integer element1 = mylist.get(i);
            System.out.print("\t"+element1);
        }
        System.out.println();

        for (Integer element2 : mylist){
            System.out.print("\t"+element2);
        }

//        Use while
        System.out.println();
        int index = 0;
        while (index<mylist.size()){
            System.out.print("\t"+mylist.get(index));
            index++;
        }

        System.out.println();
        int index1 = 0;
        int size = mylist.size();
        do{
            System.out.print("\t"+mylist.get(index1));
            index1++;
        }while (index1 < size);

    }
}
