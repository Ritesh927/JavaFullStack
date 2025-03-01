package Numbers;

import java.util.Scanner;

public class FactorialOfNum {

    public static int factorialOfNum(int num) {

        int fact = 1;
        for (int i = num; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static int factorialUsingRecursion(int num){

        if (num==0||num==1)
            return 1;

        return num*factorialUsingRecursion(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int result = factorialOfNum(num);

        int recursionResult=factorialUsingRecursion(num);

        System.out.println("Result : " + result);
        System.out.println("Recursion Result : "+recursionResult);
    }
}
