package multithreading;

class SumTest implements Runnable {
    int sum = 0;


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sum = sum + i;
        }

        System.out.println("Thread name and sum is : " + Thread.currentThread().getName() + "  " + sum);
    }
}

public class SumDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new SumTest(), "Sum1");
        Thread t2 = new Thread(new SumTest(), "Sum2");
        t1.start(); //main-----multi
        t2.start(); //main-----multi
    }
}