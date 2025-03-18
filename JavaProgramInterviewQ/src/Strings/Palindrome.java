package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String s1 = "MADAM";
        String s2 = "";

        if (s1.isEmpty()) {
            System.out.println("Its a Palindrome");
        }
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }

        if (s1.equals(s2))
            System.out.println("Its a Palindrome");
        else
            System.out.println("Its not a Palindrome");

        /*
        boolean res = PalindromeLeetCode.isPalindrome(s1);
        if (res)
            System.out.println("Its a Palindrome");
        else
            System.out.println("Its not a Palindrome");
         */
    }
}
