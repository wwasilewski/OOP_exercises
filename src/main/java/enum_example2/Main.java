package enum_example2;

import org.apache.commons.lang3.EnumUtils;

import java.util.Scanner;

/**
 * @author Wojciech Wasilewski
 * @date Created on 03.07.2019
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size (SMALL, MEDIUM, LARGE, EXTRA_LARGE): ");

        String input = sc.next().toUpperCase();

        if (EnumUtils.isValidEnum(Size.class, input)) {
            Size size = Enum.valueOf(Size.class, input);
            System.out.println("Your size: " + size);
            System.out.println("Your size's abbreviation: " + size.getAbbreviation());
            System.out.println("Your size in polish: " + size.getLanguagePL());
            if (size == Size.EXTRA_LARGE) {
                System.out.println("Good job, you didn't miss \"_\" in EXTRA_LARGE");
            }
        } else {
            System.out.println("Invalid size, use SMALL, MEDIUM, LARGE OR EXTRA_LARGE only.");
        }
        sc.close();
    }
}
