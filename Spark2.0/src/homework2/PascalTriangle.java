package homework2;

import java.util.Scanner;

/*
            1
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1
*/
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // printing spaces
            for (int s = 1; s <= n - i - 1; s++) {
                System.out.print(" ");
            }
            int number = 1;
            // printing numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}