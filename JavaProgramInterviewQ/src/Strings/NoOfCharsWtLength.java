package Strings;

public class NoOfCharsWtLength {
    public static void main(String[] args) {

        String s1 = "Selenium";

        // 1st Approach
        System.out.println(s1.lastIndexOf(""));

        // 2nd Approach
        int count = 0;
        for (char ch : s1.toCharArray()) {
            count++;
        }

        System.out.println("No of Characters : " + count);
    }
}
