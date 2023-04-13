public abstract class Player {
    private String name;
    private String gameChoice;
    public String[] rps = {"rock", "paper", "scissors"};

    public abstract void selectGameChoice();

    public Player() {}
    public Player(String name, String gameChoice, String[] rps) {
        this.name = name;
        this.gameChoice = gameChoice;
        this.rps = rps;
    }

    public String[] getRps() {
        return rps;
    }

    public void setRps(String[] rps) {
        this.rps = rps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGameChoice() {
        return gameChoice;
    }

    public void setGameChoice(String gameChoice) {
        this.gameChoice = gameChoice;
    }

}
