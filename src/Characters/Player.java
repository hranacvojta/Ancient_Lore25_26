package Characters;


import Items.Item;
import Other.Room;
import Other.GameData;


import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;


public class Player extends Character {

    GameData gD;


    private boolean headPartCovered = false;
    private boolean chestPartCovered = false;
    private boolean legsPartCovered = false;

    private int playerStatus = 0;
    private boolean sparedEnemy = false;
    private double dexterityOfPlayer = 0;
    private boolean cheaperSmith = false;
    private int purse = 100000;

    private ArrayList<Item> playersInvetory = new ArrayList<>();

    private boolean questActiveOldman = false;
    private boolean questActiveSmithl = false;
    private boolean questActiveScientist = false;
    private boolean questActiveMayor = false;


    private Room locationOfPlayer;
    public Player() {
    }

    public Room getLocationOfPlayer() {
        return locationOfPlayer;
    }

    public void setLocationOfPlayer(Room locationOfPlayer) {
        this.locationOfPlayer = locationOfPlayer;
    }



    public boolean isHeadPartCovered() {
        return headPartCovered;
    }

    public void setHeadPartCovered(boolean headPartCovered) {
        this.headPartCovered = headPartCovered;
    }

    public boolean isChestPartCovered() {
        return chestPartCovered;
    }

    public void setChestPartCovered(boolean chestPartCovered) {
        this.chestPartCovered = chestPartCovered;
    }

    public boolean isLegsPartCovered() {
        return legsPartCovered;
    }

    public void setLegsPartCovered(boolean legsPartCovered) {
        this.legsPartCovered = legsPartCovered;
    }

    public int getPlayerStatus() {
        return playerStatus;
    }

    public void setPlayerStatus(int playerStatus) {
        this.playerStatus = playerStatus;
    }

    public boolean isSparedEnemy() {
        return sparedEnemy;
    }

    public void setSparedEnemy(boolean sparedEnemy) {
        this.sparedEnemy = sparedEnemy;
    }

    public double getDexterityOfPlayer() {
        return dexterityOfPlayer;
    }

    public void setDexterityOfPlayer(double dexterityOfPlayer) {
        this.dexterityOfPlayer = dexterityOfPlayer;
    }

    public boolean isCheaperSmith() {
        return cheaperSmith;
    }

    public void setCheaperSmith(boolean cheaperSmith) {
        this.cheaperSmith = cheaperSmith;
    }

    public int getPurse() {
        return purse;
    }

    public void setPurse(int purse) {
        this.purse = purse;
    }

    public boolean isQuestActiveOldman() {
        return questActiveOldman;
    }

    public void setQuestActiveOldman(boolean questActiveOldman) {
        this.questActiveOldman = questActiveOldman;
    }

    public boolean isQuestActiveSmithl() {
        return questActiveSmithl;
    }

    public void setQuestActiveSmithl(boolean questActiveSmithl) {
        this.questActiveSmithl = questActiveSmithl;
    }

    public boolean isQuestActiveScientist() {
        return questActiveScientist;
    }

    public void setQuestActiveScientist(boolean questActiveScientist) {
        this.questActiveScientist = questActiveScientist;
    }

    public boolean isQuestActiveMayor() {
        return questActiveMayor;
    }

    public void setQuestActiveMayor(boolean questActiveMayor) {
        this.questActiveMayor = questActiveMayor;
    }

    public ArrayList<Item> getPlayersInvetory() {
        return playersInvetory;
    }
}
