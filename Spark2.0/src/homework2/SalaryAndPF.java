package homework2;

import java.util.Scanner;

public class SalaryAndPF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary : ");
        double basicSalary = sc.nextDouble();

        double providentFund = (basicSalary * 12) / 100;
        System.out.println("Your Provident Fund is : " + providentFund);
    }
}