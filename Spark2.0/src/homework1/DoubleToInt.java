package homework1;

import java.util.Scanner;

public class DoubleToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of double type: ");
        double d = sc.nextDouble();

        int res = (int) d;
        System.out.println("Original Value" + d);
        System.out.println("Converted Value" + res);
    }
}
