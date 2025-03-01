package Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println(l1);
        System.out.println("-------------->20-----------------------");

        // WAP to take out list where num greater than 20.
        List<Integer> collect1 = l1.stream().filter(i -> i > 20).collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println("------------------+5-------------------");

        // WAP to take out final list where we are adding 5 to each element.
        List<Integer> collect2 = l1.stream().map(i -> i + 5).toList();
        System.out.println(collect2);
        System.out.println("------------------toArray()-------------------");

        // Terminal operations
        // 1. toArray()
        Stream<Integer> s = Stream.of(1, 2, 3, 5, 6);
        Object[] array = s.toArray();

        for (Object a : array) {
            System.out.print(a + " ");
        }
        System.out.println();

        // count()
        System.out.println("-------------------count()-----------------");
        Stream<Integer> s1 = Stream.of(1, 2, 3, 5, 6);
        long count = s1.count();
        System.out.println(count);

        // forEach()
        System.out.println("-----------------forEach()-------------------");
        Stream<Integer> s2 = Stream.of(1, 2, 3, 5, 6);
        s2.forEach(ele -> System.err.print(ele + " "));

        // min(),max()
        System.out.println("----------------min(),max()--------------------");
        Stream<Integer> s3 = Stream.of(1, 2, 3, 5, 6);
        Stream<Integer> s4 = Stream.of(1, 2, 3, 5, 6);
        Optional<Integer> min = s3.min((o1, o2) -> o1.compareTo(o2));
        Optional<Integer> max = s4.max((o1, o2) -> o1.compareTo(o2));
        System.out.println("min : " + min.get());
        System.out.println("max : " + max.get());
    }
}