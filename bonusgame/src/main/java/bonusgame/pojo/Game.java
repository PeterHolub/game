package bonusgame.pojo;

public class Game {
    private int bet = 0;
    private int wins = 0;
    private int wonCoins = 0;
    private int spentCoins = 0;
    private int wonBonusRounds = 0;

    public int getBonusRounds() {
        return wonBonusRounds;
    }

    public void setBonusRounds() {
        this.wonBonusRounds++;
    }

    public int getBet() {
        return bet;
    }

    public void setBet() {
        this.bet++;
    }

    public int getWins() {
        return wins;
    }

    public void setWins() {
        this.wins++;
    }

    public int getWonCoins() {
        return wonCoins;
    }

    public void setWonCoins() {
        this.wonCoins = wonCoins + 5;
    }

    public int getSpentCoins() {
        return spentCoins;
    }

    public void setSpentCoins() {
        this.spentCoins = spentCoins + 10;
    }
}
