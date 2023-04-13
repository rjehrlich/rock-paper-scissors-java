public abstract class Player {
    private String name;
    private String gameChoice;

    public abstract void selectGameChoice();

    public Player() {}
    public Player(String name, String gameChoice) {
        this.name = name;
        this.gameChoice = gameChoice;
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
