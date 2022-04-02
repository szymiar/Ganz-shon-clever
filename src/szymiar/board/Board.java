package szymiar.board;

import java.io.Serializable;

public class Board implements Serializable {
    private Tray tray;
    private Points points;
    private Dices dices;
    private DiceFields diceFields;
    private Fields fields;
    private Bonus bonus;

    public Board(Tray tray, Points points, Dices dices, DiceFields diceFields, Fields fields, Bonus bonus) {
        this.tray = tray;
        this.points = points;
        this.dices = dices;
        this.diceFields = diceFields;
        this.fields = fields;
        this.bonus = bonus;
    }

    public Board(Dices dices, Fields fields) {
        this.dices = dices;
        this.fields = fields;
    }


    public Tray getTray() {
        return tray;
    }

    public void setTray(Tray tray) {
        this.tray = tray;
    }

    public Points getPoints() {
        return points;
    }

    public void setPoints(Points points) {
        this.points = points;
    }

    public Dices getDices() {
        return dices;
    }

    public void setDices(Dices dices) {
        this.dices = dices;
    }

    public DiceFields getDiceFields() {
        return diceFields;
    }

    public void setDiceFields(DiceFields diceFields) {
        this.diceFields = diceFields;
    }

    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }

    public Bonus getBonus() {
        return bonus;
    }

    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }
}
