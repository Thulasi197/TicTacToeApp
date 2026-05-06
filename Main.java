import java.util.Random;

class ComputerMove {
    public void makeMove(char[][] board, char symbol) {

        Random random = new Random();
        int row, col;
        while (true) {
            int slot = random.nextInt(9) + 1;
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;
            if (board[row][col] == ' ') {
                board[row][col] = symbol; // Place symbol
                System.out.println("Computer chose slot: " + slot);
                break;
            }
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
        ComputerMove computer = new ComputerMove();
        computer.makeMove(board, 'O');
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }
}