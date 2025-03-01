package collections.ListInJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ListRemoveDemo {

    public static void main(String[] args) {

        /*
         * create list with index
         * read index
         * Remove Index
         * if index is valid - remove element from the list
         * if index is not valid - display error message
         */

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println("List :" + list);
        System.out.println("Enter the index to be removed :");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        if (index < list.size()) {
            list.remove(index);
            System.out.println("List is removed.");
        } else
            System.out.println("No such index found.");

        System.out.println("Updated list :" + list);
        System.out.println("Enter the element to check :");
        int element = sc.nextInt();
        if (list.contains(element))
            System.out.println("Element is found.");
        else
            System.out.println("No Such element found.");

        System.out.println("Enter the element for index :");
        int num = sc.nextInt();
        if (list.contains(num))
            System.out.println("Index of " + num + " is " + list.indexOf(num));
        else
            System.out.println("Element entered is not present in the list.");
    }
}
