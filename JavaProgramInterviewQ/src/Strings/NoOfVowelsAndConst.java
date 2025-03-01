package Strings;

public class NoOfVowelsAndConst {
    public static void main(String[] args) {
        String s1="Elephant";
        s1=s1.toLowerCase();

        int vowel=0;
        int consonat=0;
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)=='a' || s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'){
                vowel++;
            }
            else
                consonat++;
        }
        System.out.println("No of Vowels :"+vowel);
        System.out.println("No of Consonants :"+consonat);
    }
}
