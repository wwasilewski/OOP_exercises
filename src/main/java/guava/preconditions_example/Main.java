package guava.preconditions_example;

/**
 * @author Wojciech Wasilewski
 * @date Created on 04.08.2019
 */
public class Main {

    public static void main(String[] args) {

        PreconditionsExample preconditionsExample = new PreconditionsExample();

        // preconditions not met, print error message defined in the sumTwoIntegers()
        System.out.println(preconditionsExample.sumTwoIntegers(null, 3));

        // preconditions not met, print error message defined in mySqrt()
        System.out.println(preconditionsExample.mySqrt(-3));
    }
}
