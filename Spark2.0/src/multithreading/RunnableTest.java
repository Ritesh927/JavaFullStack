package multithreading;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable....");
        }
    }
}

public class RunnableTest {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
//        r1.run();
        Thread t1 = new Thread(r1);
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main...");
        }
    }
}
