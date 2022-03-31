package szymiar.game;

import szymiar.board.Bonus;
import szymiar.board.Dice;
import szymiar.players.Player;

import java.io.Serializable;

public class Move implements Serializable{

    private Player player;
    private int fieldId;
    private Dice dice;
    private Bonus bonus;

}
