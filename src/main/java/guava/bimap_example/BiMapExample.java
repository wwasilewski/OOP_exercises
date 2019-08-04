package guava.bimap_example;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * @author Wojciech Wasilewski
 * @date Created on 04.08.2019
 */
public class BiMapExample {

    public static void main(String[] args) {

        // find key based on value thanks to inverse() method
        BiMap<Integer, String> myBiMap = HashBiMap.create();

        myBiMap.put(3, "Tom");
        myBiMap.put(11, "Anna");
        myBiMap.put(7, "Nicole");
        myBiMap.put(4, "Jack");

        // print key of Nicole (inverse() )
        System.out.println(myBiMap.inverse().get("Nicole"));

        // print raw map
        System.out.println(myBiMap.toString());

        System.out.println("print only keys: ");
        for (Integer x : myBiMap.keySet()) {
            System.out.println(x);
        }

        System.out.println("print only values: ");
        for (String x : myBiMap.values()) {
            System.out.println(x);
        }
    }
}
