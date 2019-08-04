package anonymousclass_example;

/**
 * @author Wojciech Wasilewski
 * @date Created on 04.08.2019
 */
public class Main {

    public static void main(String[] args) {

        // this is not an interface instance but an instance of a class implementing Calculator interface
        Calculator calculator = new Calculator() {
            @Override
            public Integer add(Integer x, Integer y) {
                return x + y;
            }

            @Override
            public Integer substract(Integer x, Integer y) {
                return x - y;

            }

            @Override
            public Integer multiply(Integer x, Integer y) {
                return x * y;

            }
        };

        System.out.println("3+2=" + calculator.add(3, 2));
        System.out.println("3-2=" + calculator.substract(3, 2));
        System.out.println("3*4=" + calculator.multiply(3, 4));
    }
}
