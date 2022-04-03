package szymiar.gui.views;

import szymiar.gui.GuiElements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateGameView extends View{

    private JFrame frame;
    private GuiElements.guiViewType guiViewType;
    private GuiElements.guiLanguage guiLanguage;
    private final int FRAME_WIDTH = 600;
    private final int FRAME_HEIGHT = 600;
    private final String FRAME_TITLE = "Ganz Shon Clever";

    /*
    Buttons configuration options
     */
    private final int BUTTONS_X = FRAME_WIDTH*1/6;
    private final int BUTTONS_WIDTH = 120;
    private final int BUTTONS_HEIGHT = 50;


    private JButton returnButton;
    private Rectangle returnButtonRectangle = new Rectangle(FRAME_WIDTH*1/12,FRAME_HEIGHT/10,40, 40);
    private GuiElements.guiTextField returnButtonTextField = GuiElements.guiTextField.EMPTY;
    private ActionListener returnButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            CreateGameView.super.switchView(frame, GuiElements.guiViewType.START, guiLanguage );
        }
    };


    private JButton polishLanguageButton;
    private Rectangle polishLanguageButtonRectangle = new Rectangle(FRAME_WIDTH*5/6,FRAME_HEIGHT/10,60, 50);
    private GuiElements.guiTextField polishLanguageButtonTextField = GuiElements.guiTextField.POLISH_LANGUAGE;
    private ActionListener polishLanguageButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            guiLanguage = GuiElements.guiLanguage.POLISH;
            CreateGameView.super.switchView(frame, guiViewType, guiLanguage );
        }
    };

    private JButton englishLanguageButton;
    private Rectangle englishLanguageButtonRectangle = new Rectangle(FRAME_WIDTH*5/6,FRAME_HEIGHT*2/10,60, 50);
    private GuiElements.guiTextField englishLanguageButtonTextField = GuiElements.guiTextField.ENGLISH_LANGUAGE;
    private ActionListener englishLanguageButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            guiLanguage = GuiElements.guiLanguage.ENGLISH;
            CreateGameView.super.switchView(frame, guiViewType, guiLanguage );
        }
    };


    public CreateGameView(JFrame frame, GuiElements.guiLanguage language){
        super();
        this.frame = frame;
        this.guiLanguage = language;
        this.guiViewType = GuiElements.guiViewType.CREATE_GAME;
        this.returnButton = new JButton();
        this.englishLanguageButton = new JButton();
        this.polishLanguageButton = new JButton();
    }


    public void configure(){
        super.configure(this.frame);

        /*
        Configure buttons
         */
        super.configureButton(this.frame, this.polishLanguageButton, this.polishLanguageButtonTextField, this.polishLanguageButtonRectangle, this.polishLanguageButtonListener, this.guiLanguage);
        super.configureButton(this.frame, this.englishLanguageButton, this.englishLanguageButtonTextField, this.englishLanguageButtonRectangle, this.englishLanguageButtonListener, this.guiLanguage);
        super.configureButton(this.frame, this.returnButton, this.returnButtonTextField, this.returnButtonRectangle, this.returnButtonListener, this.guiLanguage);

        /*
        Configure frame
         */
        super.configureFrame(this.frame, FRAME_TITLE, FRAME_WIDTH, FRAME_HEIGHT);

    }
}
