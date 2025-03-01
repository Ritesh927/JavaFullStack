package methods;

import java.util.Scanner;


class AdditionNum {
    int sum(int a, int b) {
        return a + b;
    }

    void display() {
        System.out.println("In display()");
    }
}

public class MethodDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();

        AdditionNum an = new AdditionNum();
        int res = an.sum(a, b);
        System.out.println("Result: " + res);
        an.display();
    }
}
