package Numbers;

public class CountOfDigits {

    public static int countOfDigits(int num) {
        int count = 0;

        while (num != 0) {
            count++;
            num = num / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int num = 123456;

        int totalDigits = countOfDigits(num);
        System.out.println("Number of digits : " + totalDigits);
    }
}
