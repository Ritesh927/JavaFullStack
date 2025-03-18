package Strings;

public class PalindromeLeetCode {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";
        String s4 = "a.";
        boolean res = isPalindrome(s1);
        if (res)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }

    public static boolean isPalindrome(String s1) {
        s1 = s1.trim();
        if (s1.isEmpty()) {
            return true;
        }
        s1 = s1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        if (s1.equals(s2)) {
            return true;
        } else {
            return false;
        }
    }
}
