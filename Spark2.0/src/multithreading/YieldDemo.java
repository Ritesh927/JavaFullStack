package multithreading;

class YieldTest implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

class YieldTest1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Thread.yield();
        }
    }
}

public class YieldDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new YieldTest(), "YieldTest");
        Thread t2 = new Thread(new YieldTest1(), "YieldTest1");
        t1.start();
        t2.start();
    }
}