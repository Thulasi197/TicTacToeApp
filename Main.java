import java.util.Scanner;

class PlayerInput {
    public int getSlot() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();
        return slot;
    }
}
public class Main {
    public static void main(String[] args) {

        PlayerInput input = new PlayerInput();

        int chosenSlot = input.getSlot(); // Method call

        System.out.println("You selected slot: " + chosenSlot);
    }
}