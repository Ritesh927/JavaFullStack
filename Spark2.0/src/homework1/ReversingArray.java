package homework1;

import java.util.Scanner;

public class ReversingArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be searched: ");
        int n = sc.nextInt();
        int count = 0;
        int[] arr = {1, 2, 3, 5, 9, 44, 22};

        //Original Array
        System.out.print("Original Array: ");
        for (int a : arr) {
            if (a == n)
                count++;
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("----------------------------------------------");
        // Reversed Array
        System.out.print("Reversed Array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        if (count > 0)
            System.out.println("The number is present in this Array.");
        else
            System.out.println("The number is not present in this Array.");
    }
}
