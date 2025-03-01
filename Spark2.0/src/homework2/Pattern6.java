package homework2;

import java.util.Scanner;

/*
 * * * * *
 * * * *
 * * *
 * *
 *
 */
public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            // printing spaces
            for (int space = n - i; space > 0; space--) {
                System.out.print(" ");
            }
            // printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}