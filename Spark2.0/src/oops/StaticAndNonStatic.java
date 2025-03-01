package oops;

public class StaticAndNonStatic {
    static int a = 10;
    int b = 20;

    public void test() {
        int a = 33;
        System.out.println(b);
        System.out.println(this.b);
        System.out.println(a);
        System.out.println(StaticAndNonStatic.a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(StaticAndNonStatic.a);
        StaticAndNonStatic obj1 = new StaticAndNonStatic();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        obj1.test();
    }
}