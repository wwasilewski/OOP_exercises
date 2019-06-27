package chess_game;

/**
 * @author Wojciech Wasilewski
 * @date Created on 26.06.2019
 */
public class Rock extends Piece {

    public Rock() {
        this.position = new Position(0, 4);
    }

    @Override
    public boolean isValidMove(Position newPosition) {
        if (newPosition.row == this.position.row || newPosition.column == this.position.column) {
            return true;
        } else {
            return false;
        }
    }
}
