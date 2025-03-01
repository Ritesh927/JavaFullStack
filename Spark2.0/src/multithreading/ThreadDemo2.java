package multithreading;

class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread());
            System.out.println("Child Thread....");
        }
    }
}

public class ThreadDemo2 {

    public static void main(String[] args) {
        /*
            MyThread m=new MyThread();
            Thread t1=new Thread(m);
        */

        Thread t1 = new Thread(new MyThread());
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread());
            System.out.println("Main Thread....");
        }
    }
}
