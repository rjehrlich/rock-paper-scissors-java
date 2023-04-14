import java.util.Random;

public class ComputerPlayer extends Player{
    public String[] rps = {"rock", "paper", "scissors"};
    private String computerMove;

    ComputerPlayer() {}
    ComputerPlayer(String computerMove) {
        this.computerMove = computerMove;
    }

    public String[] getRps() {
        return rps;
    }

    public void setRps(String[] rps) {
        this.rps = rps;
    }

    public String getComputerMove() {
        return computerMove;
    }

    public void setComputerMove(String computerMove) {
        this.computerMove = computerMove;
    }

    @Override
    public void selectGameChoice() {
        // create instance of Random class
        // Generate random strings in range of the rps array
        computerMove = rps[new Random().nextInt(rps.length)];
        System.out.println("Computer chose: " + computerMove);
        setGameChoice(computerMove);
    }
}
