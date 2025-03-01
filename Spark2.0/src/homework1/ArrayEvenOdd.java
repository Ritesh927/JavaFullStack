package homework1;

import java.util.Scanner;

public class ArrayEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ten numbers : ");

        int[] numbers = new int[10];
        int[] evenNumbers = new int[10];
        int[] oddNumbers = new int[10];
        int evenCount = 0;
        int oddCount = 0;

        // Taking input form user
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Separating even and odd numbers
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                evenNumbers[evenCount++] = numbers[i];
            else
                oddNumbers[oddCount++] = numbers[i];
        }

        //Original Numbers
        System.out.print("Original numbers: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
        // Printing even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
        // Printing odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
    }
}