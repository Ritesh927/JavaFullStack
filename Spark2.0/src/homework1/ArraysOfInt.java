package homework1;

import java.util.Scanner;

public class ArraysOfInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 elements of array: ");
        // Taking input from user
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing the elements using enhanced for loop
        int sum = 0;
        int max = Integer.MIN_VALUE;
        System.out.print("Elements of array: ");
        for (int a : arr) {
            System.out.print(a + " ");
            if (a > max)
                max = a;
            sum = sum + a;
        }
        // Sum of elements
        System.out.println();
        System.out.println("Sum of all elements of array: " + sum);

        // Average of elements
        System.out.println("Average of Elements : " + (sum / arr.length));

        // Maximum value in this array is
        System.out.println("Maximum value in this array : " + max);
    }
}