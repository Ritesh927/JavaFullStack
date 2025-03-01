package Numbers;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter s numner: ");
        int n = sc.nextInt();
        int start = 0;
        int second = 1;
        int next = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(next + " ");
            next = start + second;
            start = second;
            second = next;
        }
    }
}
