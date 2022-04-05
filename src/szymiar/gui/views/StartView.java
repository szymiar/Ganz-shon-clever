package szymiar.gui.views;


import org.w3c.dom.css.Rect;
import szymiar.gui.GuiElements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;


public class StartView extends View {


    private GuiElements.userType userType = GuiElements.userType.ANONYMOUS; //For now


    /*
    Frame configuration options
     */
    private GuiElements.guiLanguage guiLanguage;
    private GuiElements.guiViewType guiViewType;
    private final JFrame frame;
    private final int FRAME_WIDTH = 650;
    private final int FRAME_HEIGHT = 650;
    private final String FRAME_TITLE = "START PAGE - not logged in";



    /*
    Buttons configuration options
     */
    private final int BUTTONS_X = FRAME_WIDTH*2/5;
    private final int BUTTONS_WIDTH = 120;
    private final int BUTTONS_HEIGHT = 50;

    private JButton registerButton;
    private Rectangle registerButtonRectangle = new Rectangle(BUTTONS_X,FRAME_HEIGHT*2/12,BUTTONS_WIDTH, BUTTONS_HEIGHT);
    private GuiElements.guiTextField registerButtonTextField = GuiElements.guiTextField.REGISTER;
    private ActionListener registerButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            StartView.super.switchView(frame, GuiElements.guiViewType.REGISTER , guiLanguage);

        }
    };

    private JButton loginButton;
    private Rectangle loginButtonRectangle = new Rectangle(BUTTONS_X,FRAME_HEIGHT*3/12,BUTTONS_WIDTH, BUTTONS_HEIGHT);
    private GuiElements.guiTextField loginButtonTextField = GuiElements.guiTextField.LOGIN;
    private ActionListener loginButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            StartView.super.switchView(frame, GuiElements.guiViewType.LOGIN , guiLanguage);
        }
    };


    private JButton createGameButton;
    private Rectangle createGameButtonRectangle = new Rectangle(BUTTONS_X,FRAME_HEIGHT*4/12,BUTTONS_WIDTH, BUTTONS_HEIGHT);
    private GuiElements.guiTextField createGameButtonTextField = GuiElements.guiTextField.CREATE_GAME;
    private ActionListener createGameButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            StartView.super.switchView(frame, GuiElements.guiViewType.CREATE_GAME , guiLanguage);
        }
    };



    private JButton joinGameButton;
    private Rectangle joinGameButtonRectangle= new Rectangle(BUTTONS_X,FRAME_HEIGHT*5/12,BUTTONS_WIDTH, BUTTONS_HEIGHT);
    private GuiElements.guiTextField joinGameButtonTextField = GuiElements.guiTextField.JOIN_GAME;
    private ActionListener joinGameButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            StartView.super.switchView(frame, GuiElements.guiViewType.JOIN_GAME , guiLanguage);
        }
    };


    private JButton creditsButton;
    private Rectangle creditsButtonRectangle= new Rectangle(BUTTONS_X,FRAME_HEIGHT*6/12,BUTTONS_WIDTH, BUTTONS_HEIGHT);
    private GuiElements.guiTextField creditsButtonTextField = GuiElements.guiTextField.CREDITS;
    private ActionListener creditsButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            StartView.super.switchView(frame, GuiElements.guiViewType.CREDITS , guiLanguage);
        }
    };



    private JButton polishLanguageButton;
    private Rectangle polishLanguageButtonRectangle = new Rectangle(FRAME_WIDTH*5/6,FRAME_HEIGHT/10,60, 50);
    private GuiElements.guiTextField polishLanguageButtonTextField = GuiElements.guiTextField.POLISH_LANGUAGE;
    private ActionListener polishLanguageButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            guiLanguage = GuiElements.guiLanguage.POLISH;
            StartView.super.switchView(frame, guiViewType, guiLanguage );
        }
    };

    private JButton englishLanguageButton;
    private Rectangle englishLanguageButtonRectangle = new Rectangle(FRAME_WIDTH*5/6,FRAME_HEIGHT*2/10,60, 50);
    private GuiElements.guiTextField englishLanguageButtonTextField = GuiElements.guiTextField.ENGLISH_LANGUAGE;
    private ActionListener englishLanguageButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            guiLanguage = GuiElements.guiLanguage.ENGLISH;
            StartView.super.switchView(frame, guiViewType, guiLanguage );
        }
    };


    /*
    Text Fields configuration options
     */



    public StartView(JFrame frame, GuiElements.guiLanguage language){
        //super();
        super();
        this.guiLanguage = language;
        this.frame = frame;
        this.guiViewType = GuiElements.guiViewType.START;
        this.loginButton = new JButton();
        this.registerButton = new JButton();
        this.createGameButton = new JButton();
        this.joinGameButton = new JButton();
        this.polishLanguageButton = new JButton();
        this.englishLanguageButton = new JButton();
        this.creditsButton = new JButton();
    }

    public void configure(){
        super.configure(this.frame);

        switch(this.userType){
            case ANONYMOUS:
                /*
                Configure buttons
                */
                super.configureButton(this.frame, this.loginButton, this.loginButtonTextField, this.loginButtonRectangle, this.loginButtonListener, this.guiLanguage);
                super.configureButton(this.frame, this.registerButton, this.registerButtonTextField, this.registerButtonRectangle, this.registerButtonListener, this.guiLanguage);
                super.configureButton(this.frame, this.createGameButton, this.createGameButtonTextField, this.createGameButtonRectangle, this.createGameButtonListener, this.guiLanguage);
                super.configureButton(this.frame, this.joinGameButton, this.joinGameButtonTextField, this.joinGameButtonRectangle, this.joinGameButtonListener, this.guiLanguage);
                super.configureButton(this.frame, this.polishLanguageButton, this.polishLanguageButtonTextField, this.polishLanguageButtonRectangle, this.polishLanguageButtonListener, this.guiLanguage);
                super.configureButton(this.frame, this.englishLanguageButton, this.englishLanguageButtonTextField, this.englishLanguageButtonRectangle, this.englishLanguageButtonListener, this.guiLanguage);
                super.configureButton(this.frame, this.creditsButton, this.creditsButtonTextField, this.creditsButtonRectangle, this.creditsButtonListener, this.guiLanguage);

                break;
            case LOGGED:
                //
                break;
        }


        /*
        Configure frame
         */
        super.configureFrame(this.frame, FRAME_TITLE, FRAME_WIDTH, FRAME_HEIGHT);

    }




}
