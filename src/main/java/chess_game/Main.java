package chess_game;

/**
 * @author Wojciech Wasilewski
 * @date Created on 26.06.2019
 */
public class Main {

    public static void main(String[] args) {

        Queen queen = new Queen();
        System.out.println("Queen's starting position: " + queen.position.row + "," + queen.position.column);
        Position queenNewPosition = new Position(1, 1);
        System.out.println("Queen's new position: " + queenNewPosition.row + "," + queenNewPosition.column);

        if (queen.isValidMove(queenNewPosition)) {
            System.out.println("Queen can move there.");
        } else {
            System.out.println("Queen can't move there.");
        }

        Rook rook = new Rook();
        System.out.println("Rook's starting position: " + rook.position.row + "," + rook.position.column);
        Position rookNewPosition = new Position(6, 4);
        System.out.println("Rook's new position: " + rookNewPosition.row + "," + rookNewPosition.column);

        if (rook.isValidMove(rookNewPosition)) {
            System.out.println("Rook can move there.");
        } else {
            System.out.println("Rook can't move there.");
        }

        Bishop bishop = new Bishop();
        System.out.println("Bishop's starting position: " + bishop.position.row + "," + bishop.position.column);
        Position bishopNewPosition = new Position(6, 1);
        System.out.println("Bishop's new position: " + bishopNewPosition.row + "," + bishopNewPosition.column);

        if (bishop.isValidMove(bishopNewPosition)) {
            System.out.println("Bishop can move there.");
        } else {
            System.out.println("Bishop can't move there.");
        }
    }
}
