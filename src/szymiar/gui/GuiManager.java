package szymiar.gui;


import szymiar.gui.views.StartView;
import szymiar.gui.views.View;

import javax.swing.*;

public class GuiManager {
    public JFrame frame;
    public GuiManager(JFrame frame){
        this.frame = frame;
    }


    public void openView(View view){
        view.configure(this.frame);
        view.run(this.frame);
    }

    public void closeView(View view){
        view.close(this.frame);
    }

    public void changeView(View currentView, View newView){
        closeView(currentView);
        openView(newView);
    }


    public static void main(String[] args) {
        JFrame f = new JFrame();
        GuiManager guiManager = new GuiManager(f);
        StartView startView = new StartView();
        guiManager.openView(startView);

    }


}
