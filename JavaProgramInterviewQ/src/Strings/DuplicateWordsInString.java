package Strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsInString {
    public static void main(String[] args) {

        String str = "Big black bug Bit a Big black Dog on his big black nose";

        findDuplicateWords(str);
    }

    public static void findDuplicateWords(String s1) {

        String[] words = s1.toLowerCase().split(" ");

        Map<String, Integer> wordsCountMap = new HashMap<>();

        for (String word : words) {
            wordsCountMap.put(word, wordsCountMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordsCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
            }
        }
    }
}
