package Characters;


import Items.Item;

import java.util.ArrayList;
import java.util.function.ToDoubleBiFunction;


public class Player extends Character {


    private boolean headPartCovered = false;
    private boolean chestPartCovered = false;
    private boolean legsPartCovered = false;

    private int playerStatus;
    private boolean sparedEnemy = false;
    private double dexterityOfPlayer;
    private boolean cheaperSmith = false;
    private int purse;


    private boolean questActiveOldman = false;
    private boolean questActiveSmithl = false;
    private boolean questActiveScientist = false;
    private boolean questActiveMayor = false;

    private PlayersLocation locationOfPlayer;

//    BARRACKS
//    LOHORICE
//    ZDUSYNADSAZAVOU
//    FORESTOFMONSTERS
//    EASTMOUNTAINRANGE
//    SWAMP
//    MIDDLEEARTH


    private ArrayList<Item> playersInventory;


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

    public PlayersLocation getLocationOfPlayer() {
        return locationOfPlayer;
    }

    public void setLocationOfPlayer(PlayersLocation locationOfPlayer) {
        this.locationOfPlayer = locationOfPlayer;
    }

    public ArrayList<Item> getPlayersInventory() {
        return playersInventory;
    }

    public void setPlayersInventory(ArrayList<Item> playersInventory) {
        this.playersInventory = playersInventory;
    }
}
