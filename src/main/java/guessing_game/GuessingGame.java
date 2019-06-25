package guessing_game;

import java.util.Scanner;

/**
 * @author Wojciech Wasilewski
 * @date Created on 25.06.2019
 */
public class GuessingGame {

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("Try to guess my number from 1 to 100: ");

        Scanner sc = new Scanner(System.in);

        for (int i = 10; i > 0; i--) {
            System.out.println(i + " shots left, pick a number: ");
            int guess = sc.nextInt();

            if (randomNumber < guess) {
                System.out.println("My number is smaller than " + guess);
            } else if (randomNumber > guess) {
                System.out.println("My number is greater than " + guess);
            } else {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("Well done, you win");
        } else {
            System.out.println("Game over - you loose");
            System.out.println("The number was " + randomNumber);
        }

        sc.close();
    }
}
