package enum_example;

import java.util.Arrays;

/**
 * @author Wojciech Wasilewski
 * @date Created on 03.07.2019
 */
public class Main {

    public static void main(String[] args) {

        //printing all enums values
        Size[] values = Size.values();
        for (Size v : values) {
            System.out.println(v);
        }

        //faster printing all enums values
        System.out.println(Arrays.toString(Size.values()));

        //printing specific abbreviation
        System.out.println("SMALL enum's abbreviation: " + Size.SMALL.getAbbreviation());

        //printing specific enum's positions
        System.out.println("Position of SMALL enum: " + Size.SMALL.ordinal());
        System.out.println("Position of MEDIUM enum: " + Size.MEDIUM.ordinal());
        System.out.println("Position of LARGE enum: " + Size.LARGE.ordinal());
    }
}
