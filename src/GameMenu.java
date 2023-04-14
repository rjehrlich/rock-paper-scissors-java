import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameMenu implements Scores{
    public boolean gameRunning;
    private Scanner scan;
    private HumanPlayer humanPlayer;
    private ComputerPlayer computerPlayer;
    private TwoPlayers player1;
    private TwoPlayers player2;
//    private int humanScore;
//    private int computerScore;
//    private int draws;
    private Map<String, Integer> scoreMap;
    //game plays in a loop that will:
    //Request user selection and save it
    //Pick a random option (from computer)
    //Calculate the game result
    //display the game results and ask the user if play again
    public GameMenu() {
        scan = new Scanner(System.in);
        humanPlayer = new HumanPlayer();
        computerPlayer = new ComputerPlayer();
        //HashMap scoreMap is initialized with keys "humanScore", "computerScore", and "draws", and initial values of 0 for each.
        scoreMap = new HashMap<>();
        scoreMap.put("humanScore", 0);
        scoreMap.put("computerScore", 0);
        scoreMap.put("draws", 0);
        gameRunning = true;
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
            playAgain();
        }
    }

    @Override
    public void determineWinner() {
        String humanChoice = humanPlayer.getGameChoice();
        String computerChoice = computerPlayer.getGameChoice();
        int humanScore = scoreMap.get("humanScore");
        int computerScore = scoreMap.get("computerScore");
        int draws = scoreMap.get("draws");

        //Win conditions:
            //rock beats scissors, paper beats rock, scissors beats paper
        // Human wins
        if ((humanChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (humanChoice.equals("paper") && computerChoice.equals("rock")) ||
            (humanChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println(humanPlayer.getName() + " wins!");
            humanScore++;
        }
        // Computer wins
        else if ((computerChoice.equals("rock") && humanChoice.equals("scissors")) ||
                (computerChoice.equals("paper") && humanChoice.equals("rock")) ||
                (computerChoice.equals("scissors") && humanChoice.equals("paper"))) {
            System.out.println("Computer wins!");
            computerScore++;
        }
        // Draw
        else {
            System.out.println("It's a draw!");
            draws++;
        }
        scoreMap.put("humanScore", humanScore);
        scoreMap.put("computerScore", computerScore);
        scoreMap.put("draws", draws);
    }

    @Override
    public void displayWinner() {
        System.out.println("Score History: " + scoreMap.toString());
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
