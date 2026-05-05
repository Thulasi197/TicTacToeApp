import java.util.Random;

class GameStart {

    public static void main(String[] args) {

        // Create random object
        Random rand = new Random();

        // Generate random number (0 or 1)
        int toss = rand.nextInt(2);

        String player1 = "Player 1";
        String player2 = "Player 2";

        String currentPlayer;
        char player1Symbol;
        char player2Symbol;

        // Conditional logic based on toss
        if (toss == 0) {
            currentPlayer = player1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = player2;
            player2Symbol = 'X';
            player1Symbol = 'O';
        }

        // Output results
        System.out.println("Game Started!");
        System.out.println("Toss Result: " + currentPlayer + " starts first");
        System.out.println(player1 + " Symbol: " + player1Symbol);
        System.out.println(player2 + " Symbol: " + player2Symbol);
    }
}