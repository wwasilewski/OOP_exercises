package exercise1;

/**
 * @author Wojciech Wasilewski
 * @date Created on 24.06.2019
 */
public class Person {

    public static int instanceCount;
    public int localCount;

    public Person() {
        instanceCount++;
        localCount++;
    }
}
