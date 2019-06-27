package chess_game;

/**
 * @author Wojciech Wasilewski
 * @date Created on 26.06.2019
 */
public class Queen extends Piece {

    public Queen() {
        this.position = new Position(4, 4);
    }

    @Override
    public boolean isValidMove(Position newPosition) {

        //checking the board bounds
        if (!super.isValidMove(newPosition)) {
            return false;
        }

        //checking specific movement conditions for queen
        if (newPosition.row == this.position.row || newPosition.column == this.position.column
                || (Math.abs(newPosition.row - this.position.row) == Math.abs(newPosition.column - this.position.column))) {
            return true;
        } else {
            return false;
        }
    }
}
