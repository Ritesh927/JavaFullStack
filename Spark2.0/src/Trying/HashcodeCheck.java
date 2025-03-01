package Trying;

public class HashcodeCheck {
    public static void main(String[] args) {
        String s1 = "one";
        String s2 = "two";
        int hashcode1 = s1.hashCode();
        int hashcode2 = s2.hashCode();
        System.out.println("Hashcode of one :" + hashcode1);
        System.out.println("Hashcode of two :" + hashcode2);
    }
}