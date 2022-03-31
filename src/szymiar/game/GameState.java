package szymiar.game;

import szymiar.players.Player;
import szymiar.board.Board;

import java.io.Serializable;

public class GameState implements Serializable {

    public Board board;
    public Player player;
    public RoundTour roundTour;

    public GameState(Board board, Player player, RoundTour roundTour){
        this.board = board;
        this.player = player;
        this.roundTour= roundTour;
    }



}
