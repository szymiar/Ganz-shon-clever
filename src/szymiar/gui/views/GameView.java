package szymiar.gui.views;

import szymiar.game.GameState;

import javax.swing.*;

public class GameView extends View {
    private GameState gameState;
    private JFrame frame;

    public GameView(GameState gameState){
        this.gameState = gameState;
    }

    public GameView(JFrame frame){
        this.frame = frame;
    }


    public void configure(){
        super.configure(this.frame);
    }




    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}
