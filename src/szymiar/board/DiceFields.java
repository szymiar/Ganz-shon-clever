package szymiar.board;

import java.io.Serializable;

public class DiceFields implements Serializable {

    private Dice firstDiceField;
    private Dice secondDiceField;
    private Dice thirdDiceField;

    public DiceFields(Dice firstDice){
        this.firstDiceField = firstDice;
    }
    public DiceFields(Dice firstDice, Dice secondDice){
        this.firstDiceField = firstDice;
        this.secondDiceField = secondDice;
    }
    public DiceFields(Dice firstDice, Dice secondDice, Dice thirdDice){
        this.firstDiceField = firstDice;
        this.secondDiceField = secondDice;
        this.thirdDiceField = thirdDice;
    }

    public Dice getFirstDiceField() {
        return firstDiceField;
    }

    public void setFirstDiceField(Dice firstDiceField) {
        this.firstDiceField = firstDiceField;
    }

    public Dice getSecondDiceField() {
        return secondDiceField;
    }

    public void setSecondDiceField(Dice secondDiceField) {
        this.secondDiceField = secondDiceField;
    }

    public Dice getThirdDiceField() {
        return thirdDiceField;
    }

    public void setThirdDiceField(Dice thirdDiceField) {
        this.thirdDiceField = thirdDiceField;
    }
}
