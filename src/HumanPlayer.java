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

    /**
     * allow user to choose their game choice
     *      set the game choice in our setGameChoice method so that it is returned later
     *      check their choices against cases and validate a valid input
     */
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
