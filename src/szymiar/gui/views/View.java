package szymiar.gui.views;

import szymiar.gui.GuiElements;
import szymiar.gui.GuiTextConstants;

import javax.swing.*;

public abstract class View {
    private JFrame frame;
    private JPanel panel;
    private GuiElements.guiLanguage guiLanguage;

    public View(){
        this.guiLanguage = GuiElements.guiLanguage.ENGLISH;
    }
    public View(GuiElements.guiLanguage language){
        this.guiLanguage = language;

    }

    public void configure(JFrame f){

    }

    public void run(JFrame f){
        f.setVisible(true);
    }

    public void close(JFrame f){
        f.setVisible(false);
    }

    public void changeLanguage(JFrame f, GuiElements.guiLanguage language){
        this.guiLanguage = language;
        reload(f);
    }

    public void reload(JFrame f){
        close(f);
        configure(f);
        run(f);
    }

    public void fillButton(JButton button, GuiElements.guiTextField text){
        button.setText(GuiTextConstants.getTextConstant(guiLanguage, text));
    }



}
