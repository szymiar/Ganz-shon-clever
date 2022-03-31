package szymiar.players;

import szymiar.game.GameElements;

import java.io.Serializable;

public class Player implements Serializable {
    public String nick;
    private int id;
    private GameElements.PlayerStatus status;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GameElements.PlayerStatus getStatus() {
        return status;
    }

    public void setStatus(GameElements.PlayerStatus status) {
        this.status = status;
    }

    public Player(String nick, int id, GameElements.PlayerStatus status ) {
        this.nick = nick;
        this.status = status;
        this.id = id;
    }


}