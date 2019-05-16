package slotgame.pojo;

public class Game {
    private int bet = 0;
    private int wins = 0;
    private int wonFreeRounds = 0;
    private int spentCoins = 0;
    private int wonCoins = 0;

    public int getBet() {
        return bet;
    }

    public void setBet() {
        this.spentCoins = spentCoins + 10;
        this.bet++;
    }

    public int getWins() {
        return wins;
    }

    public void setWinsAndWinCoins() {
        this.wins++;
        this.wonCoins = wonCoins + 20;
    }

    public int getWonFreeRounds() {
        return wonFreeRounds;
    }

    public void setWonFreeRounds() {
        this.wonFreeRounds++;
    }

    public void setSpentCoins() {
        this.spentCoins = spentCoins + 10;
    }

    public int getSpentCoins() {
        return spentCoins;
    }

    public int getWonCoins() {
        return wonCoins;
    }

}
