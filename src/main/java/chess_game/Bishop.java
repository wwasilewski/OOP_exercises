package chess_game;

/**
 * @author Wojciech Wasilewski
 * @date Created on 27.06.2019
 */
public class Bishop extends Piece {

    @Override
    public boolean isValidMove(Position newPosition) {
        if (Math.abs(newPosition.row - this.position.row) == Math.abs(newPosition.column - this.position.column)) {
            return true;
        } else {
            return false;
        }
    }
}
