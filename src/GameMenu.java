import java.util.Scanner;

public class GameMenu implements Scores{
    public boolean gameRunning = false;
    private Scanner scan;
    private HumanPlayer humanPlayer;
    private ComputerPlayer computerPlayer;
    //game plays in a loop that will:
    //Request user selection and save it
    //Pick a random option (from computer)
    //Calculate the game result
    //display the game results and ask the user if play again
    public GameMenu() {
        scan = new Scanner(System.in);
        humanPlayer = new HumanPlayer();
        computerPlayer = new ComputerPlayer();
        startGame();
    }


    public void startGame() {
        gameRunning = true;
        System.out.println("Enter your name to start the game");
        humanPlayer.setName(scan.nextLine());
        System.out.println("Thank you " + humanPlayer.getName().toUpperCase());
        while (gameRunning) {
            humanPlayer.selectGameChoice();
            computerPlayer.selectGameChoice();
            determineWinner();
            displayWinner();
            updateScores();
            playAgain();
            //break;
        }
    }

    @Override
    public void determineWinner() {
        System.out.println("Checking winner");
    }

    @Override
    public void displayWinner() {
        System.out.println("showing winner");
    }

    @Override
    public void updateScores() {
        System.out.println("updating scores");
    }

    @Override
    public void playAgain() {
        String goAgainChoice;
        System.out.println("Would you like to play another round? Yes or No");
        goAgainChoice = scan.nextLine();
        if (goAgainChoice.toLowerCase().equals("yes")) {
            gameRunning = true;
        } else {
            gameRunning = false;
            System.out.println("Thank you for playing!");
            displayWinner();
        }
    }
}
