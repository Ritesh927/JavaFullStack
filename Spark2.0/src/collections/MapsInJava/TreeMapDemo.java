package collections.MapsInJava;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("a", 1);
        treeMap.put("c", 3);
        treeMap.put("b", 2);
//        treeMap.put(null, 2); // NullPointerException
        treeMap.put("a", 5);

        System.out.println("TreeMap :" + treeMap);
    }
}