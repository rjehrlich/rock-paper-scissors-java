import java.util.Locale;
import java.util.Scanner;

public class HumanPlayer extends Player implements TwoPlayers{
    private Scanner input;

    public HumanPlayer() {
        input = new Scanner(System.in);
        super.rps = getRps();
    }
    @Override
    public void selectGameChoice() {
        System.out.println("Please enter your game choice:\n"+
                "1. Rock\n"+
                "2. Paper\n"+
                "3. Scissors\n"+
                "\n");
        input.nextLine().toLowerCase();
    }
}
