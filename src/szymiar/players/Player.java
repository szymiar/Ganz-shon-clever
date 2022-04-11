package szymiar.players;

import szymiar.game.GameElements;

import java.io.Serializable;

public class Player implements Serializable {
    private String username;
    private String email;
    private int id;
    private GameElements.PlayerStatus playerStatus;
    private GameElements.PlayerType playerType;


    public Player(String username, int id, String email, GameElements.PlayerStatus playerStatus ) {
        this.username = username;
        this.playerStatus = playerStatus;
        this.id = id;
        this.email = email;
    }
    public Player(String username, int id, String email, GameElements.PlayerStatus playerStatus, GameElements.PlayerType playerType) {
        this.username = username;
        this.playerStatus = playerStatus;
        this.id = id;
        this.email = email;
        this.playerType = playerType;
    }

    public Player(String username, int id, GameElements.PlayerStatus playerStatus, GameElements.PlayerType playerType ) {
        this.username = username;
        this.playerStatus = playerStatus;
        this.id = id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String nick) {
        this.username = nick;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GameElements.PlayerStatus getPlayerStatus() {
        return playerStatus;
    }

    public void setPlayerStatus(GameElements.PlayerStatus status) {
        this.playerStatus = status;
    }

    public GameElements.PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(GameElements.PlayerType playerType) {
        this.playerType = playerType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}