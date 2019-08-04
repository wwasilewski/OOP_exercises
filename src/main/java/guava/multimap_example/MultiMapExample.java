package guava.multimap_example;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.List;

/**
 * @author Wojciech Wasilewski
 * @date Created on 04.08.2019
 */
public class MultiMapExample {

    public static void main(String[] args) {

        // one key may have many values, not like in typical Map where keys have to be unique
        Multimap<String, String> myMultiMap = ArrayListMultimap.create();

        myMultiMap.put("A", "This");
        myMultiMap.put("A", "is");
        myMultiMap.put("A", "A");
        myMultiMap.put("A", "message");
        myMultiMap.put("B", "This");
        myMultiMap.put("B", "message");
        myMultiMap.put("B", "is");
        myMultiMap.put("B", "for");
        myMultiMap.put("B", "B");

        List<String> a = (List<String>) myMultiMap.get("A");
        List<String> b = (List<String>) myMultiMap.get("B");

        System.out.println(a);
        System.out.println(b);
    }
}
