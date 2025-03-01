package Strings;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {

        String s1 = "School Master";
        String s2 = "The Classroom";

        s1 = s1.trim().replace(" ", "").toLowerCase();
        s2 = s2.trim().replace(" ", "").toLowerCase();

        char[] s1arr = s1.toCharArray();
        char[] s2arr = s2.toCharArray();

        Arrays.sort(s1arr);
        Arrays.sort(s2arr);

        if (Arrays.equals(s1arr, s2arr))
            System.out.println("Its an Anagram");
        else
            System.out.println("Its not an Anagram");
    }
}
