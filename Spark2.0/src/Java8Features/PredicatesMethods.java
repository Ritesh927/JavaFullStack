package Java8Features;

import java.util.function.Predicate;

public class PredicatesMethods {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7};

        Predicate<Integer> p1 = I -> I % 2 == 0;
        Predicate<Integer> p2 = I -> I > 2;

        System.out.print("All even numbers :");
        sol(p1, x);
        System.out.print("All numbers greater than 2 :");
        sol(p2, x);
        System.out.print("All even numbers greater than 2 :");
        sol(p1.and(p2), x);
        System.out.print("All odd numbers :");
        sol(p1.negate(), x);
        System.out.print("Either even numbers or greater than 2 :");
        sol(p1.or(p2), x);
    }

    public static void sol(Predicate p, int[] x) {
        for (int i : x) {
            if (p.test(i))
                System.out.println(i);
        }
    }
}