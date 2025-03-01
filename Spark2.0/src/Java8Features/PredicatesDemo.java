package Java8Features;

import java.util.function.Predicate;

public class PredicatesDemo {
    public static void main(String[] args) {
        Predicate<Integer> p1 = I -> I > 50;
        Predicate<String> p2 = s -> s.length() > 5;

        System.out.println(p1.test(21));
        System.out.println(p2.test("Ritesh"));
    }
}