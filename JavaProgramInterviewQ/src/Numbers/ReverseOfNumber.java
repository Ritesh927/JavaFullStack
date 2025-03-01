package Numbers;

import java.util.Scanner;

public class ReverseOfNumber {

    public static int reversedNumber(int num) {

        int reverse = 0;

        while (num != 0) {
            int ld = num % 10;
            reverse = (reverse * 10) + ld;
            num = num / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        int reversedNumber = reversedNumber(num);
        System.out.println("Original Number : " + num);
        System.out.println("Reversed Number : " + reversedNumber);
    }
}
