package homework2;

import java.util.Scanner;

/*
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 */
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}