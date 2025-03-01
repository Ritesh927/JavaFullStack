package collections.ListInJava;

import java.util.ArrayList;
import java.util.List;

public class ListInJava {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // Adding objects in list
        list.add(10);
        if (list.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            System.out.println("List is not empty.");
        }
        list.add(20);
        list.add(30);
        list.add(10); // duplicates are allowed

        System.out.println("List at index 2 : " + list.get(2));
        for (int data : list) {
            System.out.println(data);
        }
    }
}