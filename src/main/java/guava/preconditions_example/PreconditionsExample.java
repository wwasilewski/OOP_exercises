package guava.preconditions_example;

import com.google.common.base.Preconditions;

/**
 * @author Wojciech Wasilewski
 * @date Created on 04.08.2019
 */
public class PreconditionsExample {

    public Integer sumTwoIntegers(Integer x, Integer y) {
        x = Preconditions.checkNotNull(x, "1st argument can't be null");
        y = Preconditions.checkNotNull(y, "2nd argument can't be null");
        return x + y;
    }

    public double mySqrt(Integer x) {
        Preconditions.checkArgument(x > 0, "argument has to be > 0");
        return Math.sqrt(x);
    }
}
