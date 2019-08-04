package Map_examples.hashmap_example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Wojciech Wasilewski
 * @date Created on 04.08.2019
 */
public class Main {

    public static void main(String[] args) {

        Map<Integer, String> myHashMap = new HashMap<>();

        myHashMap.put(1, "one");
        myHashMap.put(2, "two");
        myHashMap.put(3, "three");
        myHashMap.put(4, "four");

        for (Map.Entry<Integer, String> x : myHashMap.entrySet()) {
            System.out.println("key: " + x.getKey() + " value: " + x.getValue());
        }
        System.out.println("----------------------------------------------------");

        myHashMap.replace(3, "changing 'three' to 33333");

        for (Map.Entry<Integer, String> x : myHashMap.entrySet()) {
            System.out.println("key: " + x.getKey() + " value: " + x.getValue());
        }
        System.out.println("----------------------------------------------------");


        myHashMap.remove(1);

        for (Map.Entry<Integer, String> x : myHashMap.entrySet()) {
            System.out.println("key: " + x.getKey() + " value: " + x.getValue());
        }
        System.out.println("----------------------------------------------------");

        System.out.println("value for key 4 is: " + myHashMap.get(4));
    }
}
