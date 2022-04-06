package szymiar.gui.views;

import szymiar.gui.GuiElements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends View{
    private JFrame frame;
    private GuiElements.guiViewType guiViewType;
    private GuiElements.guiLanguage guiLanguage;
    private final int FRAME_WIDTH = 600;
    private final int FRAME_HEIGHT = 600;
    private final String FRAME_TITLE = "Login page";

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
            LoginView.super.switchView(frame, GuiElements.guiViewType.START, guiLanguage );
        }
    };

    private JButton loginButton;
    private Rectangle loginButtonRectangle = new Rectangle(FRAME_WIDTH*11/24, FRAME_HEIGHT * 17/20, BUTTONS_WIDTH, BUTTONS_HEIGHT);
    private GuiElements.guiTextField loginButtonTextField = GuiElements.guiTextField.LOGIN;
    private ActionListener loginButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            // Action listener from all JTextFields, condition if all filled, condition if valid,
            // returns to start page as logged user
            System.out.println("User log");

        }
    };


    private JButton polishLanguageButton;
    private Rectangle polishLanguageButtonRectangle = new Rectangle(FRAME_WIDTH*5/6,FRAME_HEIGHT/10,60, 50);
    private GuiElements.guiTextField polishLanguageButtonTextField = GuiElements.guiTextField.POLISH_LANGUAGE;
    private ActionListener polishLanguageButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            guiLanguage = GuiElements.guiLanguage.POLISH;
            LoginView.super.switchView(frame, guiViewType, guiLanguage );
        }
    };

    private JButton englishLanguageButton;
    private Rectangle englishLanguageButtonRectangle = new Rectangle(FRAME_WIDTH*5/6,FRAME_HEIGHT*2/10,60, 50);
    private GuiElements.guiTextField englishLanguageButtonTextField = GuiElements.guiTextField.ENGLISH_LANGUAGE;
    private ActionListener englishLanguageButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            guiLanguage = GuiElements.guiLanguage.ENGLISH;
            LoginView.super.switchView(frame, guiViewType, guiLanguage );
        }
    };

    /*
    Labels configuration options
     */
    private final int HEADER_HEIGHT = 130;
    private final int HEADER_WIDTH = 350;

    private JLabel headerLabel;
    private Rectangle headerLabelRectangle = new Rectangle(FRAME_WIDTH*4/12, FRAME_HEIGHT * 1/20, HEADER_WIDTH, HEADER_HEIGHT  );
    private GuiElements.guiTextField headerLabelTextField = GuiElements.guiTextField.LOGIN_VIEW_HEADER;
    private Font headerLabelFont = new Font("Calibri", Font.BOLD, 32);


    private JLabel usernameLabel;
    private Rectangle usernameLabelRectangle = new Rectangle(FRAME_WIDTH*3/12, FRAME_HEIGHT * 5/20, HEADER_WIDTH*6/12, HEADER_HEIGHT*1/2  );
    private GuiElements.guiTextField usernameLabelTextField = GuiElements.guiTextField.USERNAME_EMAIL;
    private Font usernameLabelFont = new Font("Calibri", Font.BOLD, 18);


    private JLabel passwordLabel;
    private Rectangle passwordLabelRectangle = new Rectangle(FRAME_WIDTH*3/12, FRAME_HEIGHT * 9/20, HEADER_WIDTH*5/12, HEADER_HEIGHT*1/2  );
    private GuiElements.guiTextField passwordLabelTextField = GuiElements.guiTextField.PASSWORD;
    private Font passwordLabelFont = new Font("Calibri", Font.BOLD, 18);


    /*
    Text input fields configuration options
     */

    private JTextField usernameTextField;
    private Rectangle usernameTextFieldRectangle = new Rectangle(FRAME_WIDTH*6/12, FRAME_HEIGHT * 5/20, HEADER_WIDTH*1/3, HEADER_HEIGHT*1/4);
    private ActionListener usernameTextFieldListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            System.out.println("Inserting username");
        }
    };


    private JTextField passwordTextField;
    private Rectangle passwordTextFieldRectangle = new Rectangle(FRAME_WIDTH*6/12, FRAME_HEIGHT * 9/20, HEADER_WIDTH*1/3, HEADER_HEIGHT*1/4);
    private ActionListener passwordTextFieldListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            System.out.println("Inserting password");
        }
    };



    public LoginView(JFrame frame, GuiElements.guiLanguage language){
        super();
        this.frame = frame;
        this.guiLanguage = language;
        this.guiViewType = GuiElements.guiViewType.LOGIN;
        this.returnButton = new JButton();
        this.englishLanguageButton = new JButton();
        this.polishLanguageButton = new JButton();
        this.headerLabel = new JLabel();
        this.usernameLabel = new JLabel();
        this.passwordLabel = new JLabel();
        this.usernameTextField = new JTextField();
        this.passwordTextField = new JTextField();
        this.loginButton = new JButton();
    }


    public void configure(){
        super.configure(this.frame);

        /*
        Configure buttons
         */
        super.configureButton(this.frame, this.polishLanguageButton, this.polishLanguageButtonTextField, this.polishLanguageButtonRectangle, this.polishLanguageButtonListener, this.guiLanguage);
        super.configureButton(this.frame, this.englishLanguageButton, this.englishLanguageButtonTextField, this.englishLanguageButtonRectangle, this.englishLanguageButtonListener, this.guiLanguage);
        super.configureButton(this.frame, this.returnButton, this.returnButtonTextField, this.returnButtonRectangle, this.returnButtonListener, this.guiLanguage);
        super.configureButton(this.frame, this.loginButton, this.loginButtonTextField, this.loginButtonRectangle, this.loginButtonListener, this.guiLanguage);



        /*
        Configure labels
        */

        super.configureLabel(this.frame, this.headerLabel, this.headerLabelTextField, this.headerLabelRectangle,this.headerLabelFont, this.guiLanguage);
        super.configureLabel(this.frame, this.usernameLabel, this.usernameLabelTextField, this.usernameLabelRectangle,this.usernameLabelFont, this.guiLanguage);
        super.configureLabel(this.frame, this.passwordLabel, this.passwordLabelTextField, this.passwordLabelRectangle,this.passwordLabelFont, this.guiLanguage);


        /*
        Configure text input fields
         */
        super.configureTextField(this.frame, this.usernameTextField, this.usernameTextFieldRectangle, this.usernameTextFieldListener);
        super.configureTextField(this.frame, this.passwordTextField, this.passwordTextFieldRectangle, this.passwordTextFieldListener);


        /*
        Configure frame
         */
        super.configureFrame(this.frame, FRAME_TITLE, FRAME_WIDTH, FRAME_HEIGHT);

    }
}
