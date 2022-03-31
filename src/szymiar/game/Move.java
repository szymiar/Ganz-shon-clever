package szymiar.game;

import szymiar.board.Bonus;
import szymiar.board.Dice;
import szymiar.board.Field;
import szymiar.players.Player;

import java.io.Serializable;

public class Move implements Serializable{

    private Player player;
    private Field field;
    private Dice dice;
    private Bonus bonus;

    public Move(Player player, Field field, Dice dice, Bonus bonus){
        this.player= player;
        this.field = field;
        this.dice = dice;
        this.bonus = bonus;
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public Bonus getBonus() {
        return bonus;
    }

    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }

}
