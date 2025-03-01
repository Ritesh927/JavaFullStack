package Strings;

import java.util.HashMap;
import java.util.Map;

public class MinAndMaxFreqOfChar {

    public static void main(String[] args) {

        String s1 = "Feeling well";

        findMaxAndMinFreq(s1);
    }

    public static void findMaxAndMinFreq(String s1) {
        char[] s1arr = s1.trim().replaceAll(" ", "").toLowerCase().toCharArray();

        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : s1arr) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        char maxChar = '\0', minChar = '\0';
        int maxCount = Integer.MIN_VALUE, minCount = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            char currentChar = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxChar = currentChar;
                maxCount = count;
            }
            if (count < minCount) {
                minChar = currentChar;
                minCount = count;
            }
        }

        System.out.println("Maximum Occurrence : " + maxChar + " (Occurs " + maxCount + " times)");
        System.out.println("Minimum Occurrence : " + minChar + " (Occurs " + minCount + " times");

    }
}
