package Strings;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String s1 = "Feeling well";

        findCharacterFreq(s1);
    }

    public static void findCharacterFreq(String s1) {
        char[] s1arr = s1.replaceAll(" ", "").toLowerCase().toCharArray();

        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : s1arr) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character Frequency :");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
