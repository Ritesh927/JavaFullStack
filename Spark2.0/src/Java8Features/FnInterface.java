package Java8Features;

@FunctionalInterface
interface Printing {
    void m1();
}

class A {
    int x = 100;

    public void show() {
        int x = 200;
        Printing p = () -> {
            System.out.println(x);
            System.out.println(this.x);
//            x=33;
            this.x = 44;
        };
        p.m1();
        System.out.println(this.x);
    }
}

public class FnInterface {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        System.out.println(a.x);
    }
}