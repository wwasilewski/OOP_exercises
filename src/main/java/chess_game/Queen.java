package chess_game;

/**
 * @author Wojciech Wasilewski
 * @date Created on 26.06.2019
 */
public class Queen extends Piece {

    @Override
    public boolean isValidMove(Position newPosition) {
        if (super.isValidMove(newPosition)) {
            if (newPosition.row == this.position.row || newPosition.column == this.position.column
                    || (Math.abs(newPosition.row - this.position.row) == Math.abs(newPosition.column - this.position.column))) {
                return true;
            } else {
                System.out.println("Wrong position, queen can't move there");
                return false;
            }
        } else {
            System.out.println("Invalid range, you are outside the chess board (range 0-7)");
            return false;
        }
    }
}
