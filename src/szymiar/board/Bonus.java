package szymiar.board;

import szymiar.game.GameElements;

import java.io.Serializable;

public class Bonus implements Serializable {
    public GameElements.FieldBonus fieldBonus;
    public GameElements.ActionBonus actionBonus;
    public int extraDiceCount;
    public int extraThrowCount;


    public Bonus(GameElements.FieldBonus fieldBonus,
                 GameElements.ActionBonus actionBonus,
                 int extraDiceCount, int extraThrowCount) {
        this.fieldBonus = fieldBonus;
        this.actionBonus = actionBonus;
        this.extraDiceCount = extraDiceCount;
        this.extraThrowCount = extraThrowCount;
    }

    public GameElements.FieldBonus getFieldBonus() {
        return fieldBonus;
    }

    public void setFieldBonus(GameElements.FieldBonus fieldBonus) {
        this.fieldBonus = fieldBonus;
    }

    public GameElements.ActionBonus getActionBonus() {
        return actionBonus;
    }

    public void setActionBonus(GameElements.ActionBonus actionBonus) {
        this.actionBonus = actionBonus;
    }

    public int getExtraDiceCount() {
        return extraDiceCount;
    }

    public void setExtraDiceCount(int extraDiceCount) {
        this.extraDiceCount = extraDiceCount;
    }

    public int getExtraThrowCount() {
        return extraThrowCount;
    }

    public void setExtraThrowCount(int extraThrowCount) {
        this.extraThrowCount = extraThrowCount;
    }
}
