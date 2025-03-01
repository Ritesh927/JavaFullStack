package collections.MapsInJava;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("A", 10);
        map.put(null, 22);

        System.out.println("Map :" + map);

        System.out.println(map.get("A"));

        System.out.println(map.size());
    }
}
