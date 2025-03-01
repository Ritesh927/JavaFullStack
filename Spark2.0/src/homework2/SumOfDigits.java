package homework2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = num; i > 0; i = i / 10) sum = sum + (i % 10);

        System.out.println("Sum of digits of " + num + " is " + sum);
    }
}