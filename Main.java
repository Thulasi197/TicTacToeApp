import java.util.Random;
class GameSystem {

    String currentPlayer;
    char player1Symbol;
    char player2Symbol;

    String player1 = "Player 1";
    String player2 = "Player 2";

    public void startGame() {

        System.out.println("Game Started...");

        Random random = new Random();
        int tossResult = random.nextInt(2); // 0 or 1

        if (tossResult == 0) {
            currentPlayer = player1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = player2;
            player2Symbol = 'X';
            player1Symbol = 'O';
        }

        displayGameInfo();
    }

    public void displayGameInfo() {
        System.out.println("Toss completed!");
        System.out.println("Starting Player: " + currentPlayer);
        System.out.println(player1 + " Symbol: " + player1Symbol);
        System.out.println(player2 + " Symbol: " + player2Symbol);
    }
}

public class Main {
    public static void main(String[] args) {

        GameSystem game = new GameSystem();
        game.startGame(); // Execute flow
    }
}