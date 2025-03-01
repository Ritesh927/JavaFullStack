package oops;

abstract class AbstractClass {

    int a;

    abstract void test();

    AbstractClass(int a) {
        this.a = a;
        System.out.println("In AbstractClass Constructor");
    }
}

class Test extends AbstractClass {

    Test(int a) {
        super(a);
        this.a = a;
        System.out.println("In Test class constructor.");
    }

    @Override
    void test() {
        System.out.println("In test");
        System.out.println(a);
    }
}

public class Main {

    public static void main(String[] args) {
        Test test = new Test(10);
        test.test();
    }
}