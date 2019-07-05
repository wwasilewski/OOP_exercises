package timeclass_with_inputvalidation;

/**
 * @author Wojciech Wasilewski
 * @date Created on 05.07.2019
 */
public class Main {

    public static void main(String[] args) {

        //valid input
        Time t1 = new Time(11, 4, 4);
        System.out.println(t1);

        t1.setTime(23, 12, 12);
        System.out.println("My time: " + t1);
        System.out.println("My time + 3x 1second: " + t1.nextSecond().nextSecond().nextSecond());

        Time t = new Time();
        System.out.println("Zero hour: " + t);

        //invalid input - program will terminate here
//        Time t2 = new Time(60,59,12);
//        System.out.println(t2);

        //with try-catch program will not terminate when exception occurs
        try {
            Time t3 = new Time(60, 59, 12);
            System.out.println(t3);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("Print this after exception");
    }
}
