import java.util.Locale;
import java.util.Scanner;

public class HumanPlayer extends Player implements TwoPlayers{
    private Scanner input;

    public HumanPlayer() {
        input = new Scanner(System.in);
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    @Override
    public void selectGameChoice() {
        System.out.println("Please enter your game choice:\n"+
                "Rock\n"+
                "Paper\n"+
                "Scissors\n");
        String choice = input.nextLine();
        switch (choice.toLowerCase()) {
            case "rock" -> setGameChoice("rock");
            case "paper" -> setGameChoice("paper");
            case "scissors" -> setGameChoice("scissors");
            default -> {
                System.out.println("Invalid choice. Please try again.");
                selectGameChoice();
            }
        }
    }
}
