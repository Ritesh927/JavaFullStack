package Strings;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String s1 = "Do you have a car?";
        String s2 = s1.replace(" ", "");

        System.out.println("Original String :" + s1);
        System.out.println("Updated String :" + s2);
    }
}
