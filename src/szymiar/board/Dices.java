package szymiar.board;

import szymiar.game.GameElements;

import java.io.Serializable;


public class Dices implements Serializable {




    private Dice yellowDice;
    private Dice blueDice;
    private Dice greenDice;
    private Dice violetDice;
    private Dice orangeDice;
    private Dice whiteDice;

    public Dices(){
        this.yellowDice = new Dice(GameElements.DiceColor.YELLOW);
        this.greenDice = new Dice(GameElements.DiceColor.GREEN);
        this.blueDice = new Dice(GameElements.DiceColor.BLUE);
        this.violetDice = new Dice(GameElements.DiceColor.VIOLET);
        this.orangeDice = new Dice(GameElements.DiceColor.ORANGE);
        this.whiteDice = new Dice(GameElements.DiceColor.WHITE);
    }

    public Dice getYellowDice() {
        return yellowDice;
    }

    public void setYellowDice(Dice yellowDice) {
        this.yellowDice = yellowDice;
    }

    public Dice getBlueDice() {
        return blueDice;
    }

    public void setBlueDice(Dice blueDice) {
        this.blueDice = blueDice;
    }

    public Dice getGreenDice() {
        return greenDice;
    }

    public void setGreenDice(Dice greenDice) {
        this.greenDice = greenDice;
    }

    public Dice getVioletDice() {
        return violetDice;
    }

    public void setVioletDice(Dice violetDice) {
        this.violetDice = violetDice;
    }

    public Dice getOrangeDice() {
        return orangeDice;
    }

    public void setOrangeDice(Dice orangeDice) {
        this.orangeDice = orangeDice;
    }

    public Dice getWhiteDice() {
        return whiteDice;
    }

    public void setWhiteDice(Dice whiteDice) {
        this.whiteDice = whiteDice;
    }
}













/*
Server has Boards list
Server sends board to player
Player receives view
Player clicks and creates move
Server gets view and edits player's board
Server sends new board to same or new player


 */