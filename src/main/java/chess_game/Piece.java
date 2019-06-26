package chess_game;

/**
 * @author Wojciech Wasilewski
 * @date Created on 26.06.2019
 */
public class Piece {

    Position position;

    boolean isValidMove(Position newPosition) {
        if (newPosition.row > 0 && newPosition.column > 0 && newPosition.row <= 8 && newPosition.column <= 8) {
            return true;
        } else {
            return false;
        }
    }
}
