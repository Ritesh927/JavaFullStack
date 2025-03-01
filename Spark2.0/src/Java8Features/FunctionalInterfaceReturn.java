package Java8Features;

@FunctionalInterface
interface Add {
    int sum(int a, int b);
}

public class FunctionalInterfaceReturn {
    public static void main(String[] args) {
        Add add = (a, b) -> {
            return a + b;
        };

        int res = add.sum(13, 24);
        System.out.println("Result :" + res);
    }
}