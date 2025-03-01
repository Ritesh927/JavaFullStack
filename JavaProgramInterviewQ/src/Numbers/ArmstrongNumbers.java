package Numbers;

import java.util.Scanner;

/* An Armstrong number is a positive integer that is equal to the sum of its digits,
   each raised to the power of the number of digits in the number.
   0
   1   --> 1^1
   153 -->(1^3)+(5^3)+(3^3)
   370
   371........
*/
public class ArmstrongNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be check : ");
        int num = sc.nextInt();

        int orgNum = num;
        int result = 0;
        int countOfDigits = String.valueOf(num).length();

        while (num != 0) {
            int ld = num % 10;
            int power = 1;

            for (int i = 1; i <= countOfDigits; i++) {
                power = power * ld;
            }
            result = result + power;
            num = num / 10;
        }

        if (result == orgNum) {
            System.out.println(orgNum + " is an Armstrong Number.");
        } else {
            System.out.println(orgNum + " is not an Armstrong Number.");
        }
    }
}
