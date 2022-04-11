package szymiar.gui.views;

import szymiar.gui.GuiElements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetPasswordView extends View{
    private JFrame frame;
    private GuiElements.guiViewType guiViewType;
    private GuiElements.guiLanguage guiLanguage;
    private GuiElements.userType userType;
    private final int FRAME_WIDTH = 600;
    private final int FRAME_HEIGHT = 600;
    private final String FRAME_TITLE = "Reset password page";

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
            ResetPasswordView.super.switchView(frame, GuiElements.guiViewType.START, guiLanguage , userType);
        }
    };

    private JButton confirmButton;
    private Rectangle confirmButtonRectangle = new Rectangle(FRAME_WIDTH*11/24, FRAME_HEIGHT * 17/20, BUTTONS_WIDTH, BUTTONS_HEIGHT);
    private GuiElements.guiTextField confirmButtonTextField = GuiElements.guiTextField.CONFIRM;
    private ActionListener confirmButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            // Action listener from all JTextFields, condition if all filled, condition if valid,
            // returns to start page as logged user
            System.out.println("Confirm");

        }
    };


    private JButton polishLanguageButton;
    private Rectangle polishLanguageButtonRectangle = new Rectangle(FRAME_WIDTH*5/6,FRAME_HEIGHT/10,60, 50);
    private GuiElements.guiTextField polishLanguageButtonTextField = GuiElements.guiTextField.POLISH_LANGUAGE;
    private ActionListener polishLanguageButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            guiLanguage = GuiElements.guiLanguage.POLISH;
            ResetPasswordView.super.switchView(frame, guiViewType, guiLanguage , userType);
        }
    };

    private JButton englishLanguageButton;
    private Rectangle englishLanguageButtonRectangle = new Rectangle(FRAME_WIDTH*5/6,FRAME_HEIGHT*2/10,60, 50);
    private GuiElements.guiTextField englishLanguageButtonTextField = GuiElements.guiTextField.ENGLISH_LANGUAGE;
    private ActionListener englishLanguageButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            guiLanguage = GuiElements.guiLanguage.ENGLISH;
            ResetPasswordView.super.switchView(frame, guiViewType, guiLanguage, userType );
        }
    };

    /*
    Labels configuration options
     */
    private final int HEADER_HEIGHT = 130;
    private final int HEADER_WIDTH = 350;

    private JLabel headerLabel;
    private Rectangle headerLabelRectangle = new Rectangle(FRAME_WIDTH*4/12, FRAME_HEIGHT * 1/20, HEADER_WIDTH, HEADER_HEIGHT  );
    private GuiElements.guiTextField headerLabelTextField = GuiElements.guiTextField.RESET_PASSWORD_VIEW_HEADER;
    private Font headerLabelFont = new Font("Calibri", Font.BOLD, 32);


    private JLabel newPasswordLabel;
    private Rectangle newPasswordLabelRectangle = new Rectangle(FRAME_WIDTH*3/12, FRAME_HEIGHT * 5/20, HEADER_WIDTH*6/12, HEADER_HEIGHT*1/2  );
    private GuiElements.guiTextField newPasswordLabelTextField = GuiElements.guiTextField.NEW_PASSWORD;
    private Font newPasswordLabelFont = new Font("Calibri", Font.BOLD, 18);


    private JLabel repeatPasswordLabel;
    private Rectangle repeatPasswordLabelRectangle = new Rectangle(FRAME_WIDTH*3/12, FRAME_HEIGHT * 9/20, HEADER_WIDTH*5/12, HEADER_HEIGHT*1/2  );
    private GuiElements.guiTextField repeatPasswordLabelTextField = GuiElements.guiTextField.REPEAT_PASSWORD;
    private Font repeatPasswordLabelFont = new Font("Calibri", Font.BOLD, 18);


    /*
    Text input fields configuration options
     */

    private JTextField newPasswordTextField;
    private Rectangle newPasswordTextFieldRectangle = new Rectangle(FRAME_WIDTH*6/12, FRAME_HEIGHT * 6/20, HEADER_WIDTH*1/3, HEADER_HEIGHT*1/4);
    private ActionListener newPasswordTextFieldListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            System.out.println("Inserting new password");
        }
    };


    private JTextField repeatPasswordTextField;
    private Rectangle repeatPasswordTextFieldRectangle = new Rectangle(FRAME_WIDTH*6/12, FRAME_HEIGHT * 10/20, HEADER_WIDTH*1/3, HEADER_HEIGHT*1/4);
    private ActionListener repeatPasswordTextFieldListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            System.out.println("Repeating password");
        }
    };



    public ResetPasswordView(JFrame frame, GuiElements.guiLanguage language, GuiElements.userType userType){
        super();
        this.frame = frame;
        this.guiLanguage = language;
        this.guiViewType = GuiElements.guiViewType.RESET_PASSWORD;
        this.userType = userType;
        this.returnButton = new JButton();
        this.englishLanguageButton = new JButton();
        this.polishLanguageButton = new JButton();
        this.headerLabel = new JLabel();
        this.newPasswordLabel= new JLabel();
        this.repeatPasswordLabel = new JLabel();
        this.newPasswordTextField = new JTextField();
        this.repeatPasswordTextField = new JTextField();
        this.confirmButton = new JButton();
    }


    public void configure(){
        super.configure(this.frame);

        /*
        Configure buttons
         */
        super.configureButton(this.frame, this.polishLanguageButton, this.polishLanguageButtonTextField, this.polishLanguageButtonRectangle, this.polishLanguageButtonListener, this.guiLanguage);
        super.configureButton(this.frame, this.englishLanguageButton, this.englishLanguageButtonTextField, this.englishLanguageButtonRectangle, this.englishLanguageButtonListener, this.guiLanguage);
        super.configureButton(this.frame, this.returnButton, this.returnButtonTextField, this.returnButtonRectangle, this.returnButtonListener, this.guiLanguage);
        super.configureButton(this.frame, this.confirmButton, this.confirmButtonTextField, this.confirmButtonRectangle, this.confirmButtonListener, this.guiLanguage);



        /*
        Configure labels
        */

        super.configureLabel(this.frame, this.headerLabel, this.headerLabelTextField, this.headerLabelRectangle,this.headerLabelFont, this.guiLanguage);
        super.configureLabel(this.frame, this.newPasswordLabel, this.newPasswordLabelTextField, this.newPasswordLabelRectangle,this.newPasswordLabelFont, this.guiLanguage);
        super.configureLabel(this.frame, this.repeatPasswordLabel, this.returnButtonTextField, this.returnButtonRectangle,this.repeatPasswordLabelFont, this.guiLanguage);


        /*
        Configure text input fields
         */
        super.configureTextField(this.frame, this.newPasswordTextField, this.newPasswordTextFieldRectangle, this.newPasswordTextFieldListener);
        super.configureTextField(this.frame, this.repeatPasswordTextField, this.repeatPasswordTextFieldRectangle, this.repeatPasswordTextFieldListener);


        /*
        Configure frame
         */
        super.configureFrame(this.frame, FRAME_TITLE, FRAME_WIDTH, FRAME_HEIGHT);

    }
}
