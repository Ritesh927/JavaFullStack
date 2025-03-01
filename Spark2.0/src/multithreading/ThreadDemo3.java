package multithreading;

class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child Thread");
        }
    }
}

public class ThreadDemo3 {
    public static void main(String[] args) throws InterruptedException {

        MyRunnable1 runnable1 = new MyRunnable1();
        Thread t = new Thread(runnable1); // here runnable1 is Target Runnable
        t.start();
//        t.join();

        for (int i = 0; i < 10; i++) {
            System.out.println("main Thread");
        }
    }
}