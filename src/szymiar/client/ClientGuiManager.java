package szymiar.client;


import szymiar.game.GameState;
import szymiar.gui.GuiElements;
import szymiar.gui.views.StartView;
import szymiar.gui.views.View;

import javax.swing.*;

public class ClientGuiManager {
    public JFrame frame;
    public View view;
    public ClientGuiManager(){
        this.frame = new JFrame();
        this.view = new View(this.frame);
    }


    public void openView(){
        this.view.openStartView(this.view.getFrame());
    }

    public void closeView(){
        this.view.close(this.view.getFrame());
    }

    public void updateView(GameState gameState){
        this.view.update(gameState);
    }



    public void changeView(View currentView, View newView){
        closeView();
        this.view = newView;
        this.frame = newView.getFrame();
        newView.switchView(this.frame, newView.getGuiViewType(), newView.getGuiLanguage(), newView.getUserType());
    }


    public static void main(String[] args) {
        ClientGuiManager clientGuiManager = new ClientGuiManager();
        clientGuiManager.openView();

    }


}
