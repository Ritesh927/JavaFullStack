package homework2;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of all numbers from 1-100 : " + sum);
    }
}