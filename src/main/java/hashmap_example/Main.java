package hashmap_example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Wojciech Wasilewski
 * @date Created on 04.08.2019
 */
public class Main {

    public static void main(String[] args) {

        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(1, "one");
        myMap.put(2, "two");
        myMap.put(3, "three");
        myMap.put(4, "four");

        for (Map.Entry<Integer, String> x : myMap.entrySet()) {
            System.out.println("key: " + x.getKey() + " value: " + x.getValue());
        }

        myMap.replace(3, "changing 'three' to 33333");

        for (Map.Entry<Integer, String> x : myMap.entrySet()) {
            System.out.println("key: " + x.getKey() + " value: " + x.getValue());
        }

        myMap.remove(1);

        for (Map.Entry<Integer, String> x : myMap.entrySet()) {
            System.out.println("key: " + x.getKey() + " value: " + x.getValue());
        }

        System.out.println("value for key 4 is: " + myMap.get(4));
    }
}
