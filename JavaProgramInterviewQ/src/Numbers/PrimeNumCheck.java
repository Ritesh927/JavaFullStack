package Numbers;

import java.util.Scanner;

public class PrimeNumCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be checked : ");
        int num=sc.nextInt();
        primeNumCheck(num);

    }

    public static void primeNumCheck(int num){
        int count=0;
        for (int i=2;i<=num/2;i++){
            if (num%i==0){
                count++;
            }
        }
        if (count==0)
            System.out.println("Number is a Prime Number");
        else
            System.out.println("Number is not a Prime Number");
    }
}
