package collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorAndEnumerationDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(90);
        vector.add(10);
        vector.add(20);
        vector.add(30);

        System.out.println("Vector :" + vector);
        Enumeration<Integer> elements = vector.elements();
        while (elements.hasMoreElements()) {
            Integer data = (Integer) elements.nextElement();
            System.out.println(data);
        }
    }
}