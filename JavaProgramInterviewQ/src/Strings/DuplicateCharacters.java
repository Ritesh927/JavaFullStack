package Strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String s1 = "programming";

        findDuplicateCharacters(s1);
        duplicateCharsUsingArray(s1);
    }

    public static void findDuplicateCharacters(String string) {

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : string.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
            }
        }
    }

    public static void duplicateCharsUsingArray(String str) {

        int[] count = new int[256];

        for (char c : str.toCharArray()) {
            count[c]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1)
                System.out.println((char) i + " occurs " + count[i] + " times");
        }
    }
}
