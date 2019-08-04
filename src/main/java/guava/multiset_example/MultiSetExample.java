package guava.multiset_example;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * @author Wojciech Wasilewski
 * @date Created on 04.08.2019
 */
public class MultiSetExample {

    public static void main(String[] args) {

        // may store many same values (set can store only unique values)
        Multiset<Integer> myMultiSet = HashMultiset.create();

        myMultiSet.add(1);
        myMultiSet.add(2);
        myMultiSet.add(3);
        myMultiSet.add(4);
        myMultiSet.add(5);
        myMultiSet.add(5);
        myMultiSet.add(5);

        for (Integer x : myMultiSet) {
            System.out.println(x);
        }
    }
}
