package Strings;

import java.util.Arrays;

public class CustomSorting {
    public static void main(String[] args) {
        String[] words = {"banana", "apple", "cherry"};

        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
