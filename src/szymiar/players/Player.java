package szymiar.players;

import java.io.Serializable;

public class Player implements Serializable {
    public String nick;
    private int id;
    private String state = "passive";



    public Player(String nick) {
        this.nick = nick;
        this.state = state;
    }

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
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}