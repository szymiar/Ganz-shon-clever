package szymiar.board;

import java.io.Serializable;

public class Tray implements Serializable {

    public Dice firstTrayField;
    public Dice secondTrayField;
    public Dice thirdTrayField;
    public Dice fourthTrayField;
    public Dice fifthTrayField;
    public Dice sixthTrayField;

    public Tray(Dice firstDice){
        this.firstTrayField = firstDice;
    }
    public Tray(Dice firstDice, Dice secondDice){
        this.firstTrayField = firstDice;
        this.secondTrayField = secondDice;
    }
    public Tray(Dice firstDice, Dice secondDice, Dice thirdDice){
        this.firstTrayField = firstDice;
        this.secondTrayField = secondDice;
        this.thirdTrayField = thirdDice;
    }

    public Tray(Dice firstDice, Dice secondDice, Dice thirdDice, Dice fourthDice){
        this.firstTrayField = firstDice;
        this.secondTrayField = secondDice;
        this.thirdTrayField = thirdDice;
        this.fourthTrayField = fourthDice;
    }

    public Tray(Dice firstDice, Dice secondDice, Dice thirdDice, Dice fourthDice
            , Dice fifthDice){

        this.firstTrayField = firstDice;
        this.secondTrayField = secondDice;
        this.thirdTrayField = thirdDice;
        this.fourthTrayField = fourthDice;
        this.fifthTrayField = fifthDice;
    }

    public Tray(Dice firstDice, Dice secondDice, Dice thirdDice, Dice fourthDice
            , Dice fifthDice, Dice sixthDice){

        this.firstTrayField = firstDice;
        this.secondTrayField = secondDice;
        this.thirdTrayField = thirdDice;
        this.fourthTrayField = fourthDice;
        this.fifthTrayField = fifthDice;
        this.sixthTrayField = sixthDice;
    }

    public Dice getFirstTrayField() {
        return firstTrayField;
    }

    public void setFirstTrayField(Dice firstTrayField) {
        this.firstTrayField = firstTrayField;
    }

    public Dice getSecondTrayField() {
        return secondTrayField;
    }

    public void setSecondTrayField(Dice secondTrayField) {
        this.secondTrayField = secondTrayField;
    }

    public Dice getThirdTrayField() {
        return thirdTrayField;
    }

    public void setThirdTrayField(Dice thirdTrayField) {
        this.thirdTrayField = thirdTrayField;
    }

    public Dice getFourthTrayField() {
        return fourthTrayField;
    }

    public void setFourthTrayField(Dice fourthTrayField) {
        this.fourthTrayField = fourthTrayField;
    }

    public Dice getFifthTrayField() {
        return fifthTrayField;
    }

    public void setFifthTrayField(Dice fifthTrayField) {
        this.fifthTrayField = fifthTrayField;
    }

    public Dice getSixthTrayField() {
        return sixthTrayField;
    }

    public void setSixthTrayField(Dice sixthTrayField) {
        this.sixthTrayField = sixthTrayField;
    }
}

