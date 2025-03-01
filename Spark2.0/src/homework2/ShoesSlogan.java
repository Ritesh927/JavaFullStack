package homework2;

import java.util.Locale;
import java.util.Scanner;

public class ShoesSlogan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Shoes brand Nike,Adidas,Puma,Reebok : ");
        String brand = sc.nextLine();
        brand = brand.toLowerCase();

        switch (brand) {
            case "nike" -> {
                System.out.println("Just do it");
                break;
            }
            case "adidas" -> {
                System.out.println("Impossible is nothing");
                break;
            }
            case "puma" -> {
                System.out.println("Forever Faster");
                break;
            }
            case "reebok" -> {
                System.out.println("I Am What I Am");
                break;
            }
            default -> System.out.println("Please enter a mentioned brand.");
        }
    }
}