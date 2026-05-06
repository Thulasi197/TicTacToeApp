class MoveValidator {
    public boolean isValidMove(char[][] board, int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid position! Row and column must be between 0 and 2.");
            return false;
        }
        if (board[row][col] != ' ') {
            System.out.println("Cell already occupied! Choose another position.");
            return false;
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args) {

        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        MoveValidator validator = new MoveValidator();

    
        int row = 1;
        int col = 1;

        if (validator.isValidMove(board, row, col)) {
            System.out.println("Move accepted!");
            board[row][col] = 'X'; // Place symbol
        } else {
            System.out.println("Move rejected!");
        }
    }
}