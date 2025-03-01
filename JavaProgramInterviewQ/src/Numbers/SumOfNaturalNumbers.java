package Numbers;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        int result = findSumOfNnaturalNo(num);
        System.out.println("Result : " + (num * (num + 1)) / 2);
        System.out.println("-----------------------------------");
        System.out.println("2nd Approach Result : " + result);
    }

    public static int findSumOfNnaturalNo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
