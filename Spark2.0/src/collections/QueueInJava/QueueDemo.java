package collections.QueueInJava;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(10);

        System.out.println("Queue :" + queue);
        System.out.println("Peek :" + queue.peek());
        System.out.println("Element :" + queue.element());
        System.out.println("Poll :" + queue.poll());
        queue.offer(50);
        System.out.println("Updated Queue :" + queue);
    }
}
