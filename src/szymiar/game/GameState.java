package szymiar.game;

import szymiar.players.Player;
import szymiar.board.Board;

import java.io.Serializable;

public class GameState implements Serializable {

    private Board board;
    private Player player;
    private RoundTour roundTour;

    public GameState(Board board, Player player, RoundTour roundTour){
        this.board = board;
        this.player = player;
        this.roundTour= roundTour;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public RoundTour getRoundTour() {
        return roundTour;
    }

    public void setRoundTour(RoundTour roundTour) {
        this.roundTour = roundTour;
    }


}
