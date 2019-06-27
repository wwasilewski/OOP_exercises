package chess_game;

/**
 * @author Wojciech Wasilewski
 * @date Created on 26.06.2019
 */
public class Main {

    public static void main(String[] args) {

        Queen queen = new Queen();
        Position testPosition = new Position(7, 7);

        if (queen.isValidMove(testPosition)) {
            System.out.println("Can move there");
        } else {
            System.out.println("Can't move there");
        }

        Rock rock = new Rock();
        Position testPosition2 = new Position(0, 4);


        if (rock.isValidMove(testPosition2)) {
            System.out.println("CAN move there");
        } else {
            System.out.println("CAN't move there");
        }
    }
}
