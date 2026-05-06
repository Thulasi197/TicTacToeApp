class BoardUpdater {
    public void updateBoard(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
        System.out.println("Board updated successfully!");
    }
    public void displayBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        BoardUpdater updater = new BoardUpdater();
        int row = 1;
        int col = 1;
        char symbol = 'X';
        updater.updateBoard(board, row, col, symbol);

        updater.displayBoard(board);
    }
}