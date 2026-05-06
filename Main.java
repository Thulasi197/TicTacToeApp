import java.util.Random;

public class Main {

    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    static char currentPlayer = 'X';

    public static void main(String[] args) {

        boolean gameOver = false;

        while (!gameOver) {

            // Computer makes a move (for demo, both players auto-play)
            makeRandomMove(currentPlayer);

            displayBoard();

            // Check win
            if (checkWin(currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                gameOver = true;
            }
            // Check draw
            else if (isBoardFull()) {
                System.out.println("It's a draw!");
                gameOver = true;
            }
            // Switch turn
            else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }

    // UC7 logic reused – random valid move
    static void makeRandomMove(char symbol) {
        Random random = new Random();
        int row, col;

        while (true) {
            int slot = random.nextInt(9) + 1;

            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            if (board[row][col] == ' ') {
                board[row][col] = symbol;
                System.out.println("Player " + symbol + " chose slot: " + slot);
                break;
            }
        }
    }

    // Display board
    static void displayBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
        }
        System.out.println();
    }

    // Check win condition
    static boolean checkWin(char s) {

        // Rows, Columns, Diagonals
        return (board[0][0] == s && board[0][1] == s && board[0][2] == s) ||
               (board[1][0] == s && board[1][1] == s && board[1][2] == s) ||
               (board[2][0] == s && board[2][1] == s && board[2][2] == s) ||

               (board[0][0] == s && board[1][0] == s && board[2][0] == s) ||
               (board[0][1] == s && board[1][1] == s && board[2][1] == s) ||
               (board[0][2] == s && board[1][2] == s && board[2][2] == s) ||

               (board[0][0] == s && board[1][1] == s && board[2][2] == s) ||
               (board[0][2] == s && board[1][1] == s && board[2][0] == s);
    }

    // Check draw condition
    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}