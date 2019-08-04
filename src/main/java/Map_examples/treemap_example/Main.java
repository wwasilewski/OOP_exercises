package Map_examples.treemap_example;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Wojciech Wasilewski
 * @date Created on 04.08.2019
 */
public class Main {

    public static void main(String[] args) {

        Map<Integer, String> myTreeMap = new TreeMap<>();

        myTreeMap.put(5, "five");
        myTreeMap.put(4, "four");
        myTreeMap.put(3, "three");
        myTreeMap.put(1, "one");
        myTreeMap.put(2, "two");
        myTreeMap.put(7, "seven");

        for (Map.Entry<Integer, String> x : myTreeMap.entrySet()) {
            System.out.println("key: " + x.getKey() + " value: " + x.getValue());
        }
    }
}
