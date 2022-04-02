package szymiar.gui.views;

import szymiar.game.GameState;

public class GameView extends View {
    private GameState gameState;

    public GameView(GameState gameState){
        this.gameState = gameState;
    }







    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}
