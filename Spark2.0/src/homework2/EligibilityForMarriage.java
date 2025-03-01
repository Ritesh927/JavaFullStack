package homework2;

import java.util.Scanner;

public class EligibilityForMarriage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of person : ");
        int age = sc.nextInt();
        System.out.println("Enter the salary of person : ");
        double salary = sc.nextDouble();


        if (age < 30 && salary > 100000) {
            System.out.println("This person is eligibe for marriage.");
        } else
            System.out.println("This person is not eligible for marriage.");
    }
}