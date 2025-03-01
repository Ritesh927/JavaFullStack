package Strings;

public class NoOfCharacters {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }

        System.out.println("Original String :" + s1);
        System.out.println("Reversed String :" + s2);
    }
}
