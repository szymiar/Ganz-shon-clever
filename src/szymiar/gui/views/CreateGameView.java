package szymiar.gui.views;

import szymiar.gui.GuiElements;
import szymiar.gui.GuiTextConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateGameView extends View{

    private JFrame frame;
    private GuiElements.guiViewType guiViewType;
    private GuiElements.guiLanguage guiLanguage;
    private GuiElements.userType userType;
    private final int FRAME_WIDTH = 600;
    private final int FRAME_HEIGHT = 600;
    private final String FRAME_TITLE = "Create new game page";

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
            CreateGameView.super.switchView(frame, GuiElements.guiViewType.START, guiLanguage , userType);
        }
    };

    private JButton createButton;
    private Rectangle createButtonRectangle = new Rectangle(FRAME_WIDTH*11/24, FRAME_HEIGHT * 17/20, BUTTONS_WIDTH, BUTTONS_HEIGHT);
    private GuiElements.guiTextField createButtonTextField = GuiElements.guiTextField.CONFIRM;
    private ActionListener createButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            // Action listener from all JTextFields, message box "are you sure" appears, default
            // parameters set
            System.out.println("Create");

        }
    };


    private JButton polishLanguageButton;
    private Rectangle polishLanguageButtonRectangle = new Rectangle(FRAME_WIDTH*5/6,FRAME_HEIGHT/10,60, 50);
    private GuiElements.guiTextField polishLanguageButtonTextField = GuiElements.guiTextField.POLISH_LANGUAGE;
    private ActionListener polishLanguageButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            guiLanguage = GuiElements.guiLanguage.POLISH;
            CreateGameView.super.switchView(frame, guiViewType, guiLanguage, userType );
        }
    };

    private JButton englishLanguageButton;
    private Rectangle englishLanguageButtonRectangle = new Rectangle(FRAME_WIDTH*5/6,FRAME_HEIGHT*2/10,60, 50);
    private GuiElements.guiTextField englishLanguageButtonTextField = GuiElements.guiTextField.ENGLISH_LANGUAGE;
    private ActionListener englishLanguageButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            guiLanguage = GuiElements.guiLanguage.ENGLISH;
            CreateGameView.super.switchView(frame, guiViewType, guiLanguage, userType );
        }
    };

    /*
    Labels configuration options
     */
    private final int HEADER_HEIGHT = 130;
    private final int HEADER_WIDTH = 350;

    private JLabel headerLabel;
    private Rectangle headerLabelRectangle = new Rectangle(FRAME_WIDTH*4/12, FRAME_HEIGHT * 1/20, HEADER_WIDTH, HEADER_HEIGHT  );
    private GuiElements.guiTextField headerLabelTextField = GuiElements.guiTextField.CREATE_GAME_VIEW_HEADER;
    private Font headerLabelFont = new Font("Calibri", Font.BOLD, 32);


    private JLabel nameLabel;
    private Rectangle nameLabelRectangle = new Rectangle(FRAME_WIDTH*3/12, FRAME_HEIGHT * 5/20, HEADER_WIDTH*6/12, HEADER_HEIGHT*1/2  );
    private GuiElements.guiTextField nameLabelTextField = GuiElements.guiTextField.NAME;
    private Font nameLabelFont = new Font("Calibri", Font.BOLD, 18);

    private JLabel playersNumberLabel;
    private Rectangle playersNumberLabelRectangle = new Rectangle(FRAME_WIDTH*3/12, FRAME_HEIGHT * 8/20, HEADER_WIDTH*6/12, HEADER_HEIGHT*1/2  );
    private GuiElements.guiTextField playersNumberLabelTextField = GuiElements.guiTextField.PLAYERS_NUMBER;
    private Font playersNumberLabelFont = new Font("Calibri", Font.BOLD, 18);


    private JLabel passwordLabel;
    private Rectangle passwordLabelRectangle = new Rectangle(FRAME_WIDTH*3/12, FRAME_HEIGHT * 11/20, HEADER_WIDTH*6/12, HEADER_HEIGHT*1/2  );
    private GuiElements.guiTextField passwordLabelTextField = GuiElements.guiTextField.PASSWORD;
    private Font passwordLabelFont = new Font("Calibri", Font.BOLD, 18);


    private JLabel enterPasswordLabel;
    private Rectangle enterPasswordLabelRectangle = new Rectangle(FRAME_WIDTH*3/12, FRAME_HEIGHT * 14/20, HEADER_WIDTH*5/12, HEADER_HEIGHT*1/2  );
    private GuiElements.guiTextField enterPasswordLabelTextField = GuiElements.guiTextField.ENTER_PASSWORD;
    private Font enterPasswordLabelFont = new Font("Calibri", Font.BOLD, 18);


    /*
    Text input fields configuration options
     */

    private JTextField nameTextField;
    private Rectangle nameTextFieldRectangle = new Rectangle(FRAME_WIDTH*6/12, FRAME_HEIGHT * 11/40, HEADER_WIDTH*1/3, HEADER_HEIGHT*1/4);
    private ActionListener nameTextFieldListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            System.out.println("Entering game name");
        }
    };


    private JTextField enterPasswordTextField;
    private Rectangle enterPasswordTextFieldRectangle = new Rectangle(FRAME_WIDTH*6/12, FRAME_HEIGHT * 29/40, HEADER_WIDTH*1/3, HEADER_HEIGHT*1/4);
    private ActionListener enterPasswordTextFieldListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            System.out.println("Entering password");
        }
    };


    /*
    Multiple choice combo box fields
     */

    private GuiElements.guiTextField[] playersNumberComboBoxOptions = {GuiElements.guiTextField.ONE,
            GuiElements.guiTextField.TWO, GuiElements.guiTextField.THREE, GuiElements.guiTextField.FOUR};
    private JComboBox<String> playersNumberComboBox;
    private Rectangle playersNumberComboBoxRectangle = new Rectangle(FRAME_WIDTH*6/12, FRAME_HEIGHT * 17/40, HEADER_WIDTH*1/3, HEADER_HEIGHT*1/4);


    private GuiElements.guiTextField[] passwordComboBoxOptions = {GuiElements.guiTextField.YES, GuiElements.guiTextField.NO};
    private JComboBox<String> passwordComboBox;
    private Rectangle passwordComboBoxRectangle = new Rectangle(FRAME_WIDTH*6/12, FRAME_HEIGHT * 23/40, HEADER_WIDTH*1/3, HEADER_HEIGHT*1/4);
    private ActionListener passwordComboBoxListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String choice;
            try{
                choice = passwordComboBox.getItemAt(passwordComboBox.getSelectedIndex());
                if(choice.equals(GuiTextConstants.getTextConstant(guiLanguage,GuiElements.guiTextField.YES))){
                    enterPasswordTextField.setEnabled(true);
                    enterPasswordLabel.setEnabled(true);
                }
                else{
                    enterPasswordLabel.setEnabled(false);
                    enterPasswordTextField.setEnabled(false);
                }
            }
            catch(NullPointerException ex){
                System.out.println("Empty event " + ex.getMessage());
            }
        }
    };



    public CreateGameView(JFrame frame, GuiElements.guiLanguage language, GuiElements.userType userType){
        super();
        this.frame = frame;
        this.guiLanguage = language;
        this.userType = userType;
        this.guiViewType = GuiElements.guiViewType.CREATE_GAME;
        this.returnButton = new JButton();
        this.englishLanguageButton = new JButton();
        this.polishLanguageButton = new JButton();
        this.headerLabel = new JLabel();
        this.nameLabel= new JLabel();
        this.enterPasswordLabel = new JLabel();
        this.playersNumberLabel = new JLabel();
        this.passwordLabel = new JLabel();
        this.nameTextField = new JTextField();
        this.enterPasswordTextField = new JTextField();
        this.createButton = new JButton();
        this.playersNumberComboBox = new JComboBox<>(super.convertTextFieldEnums(this.playersNumberComboBoxOptions, this.guiLanguage));
        this.passwordComboBox = new JComboBox<>(super.convertTextFieldEnums(this.passwordComboBoxOptions, this.guiLanguage));
    }


    public void configure(){
        super.configure(this.frame);

        /*
        Configure buttons
         */
        super.configureButton(this.frame, this.polishLanguageButton, this.polishLanguageButtonTextField, this.polishLanguageButtonRectangle, this.polishLanguageButtonListener, this.guiLanguage);
        super.configureButton(this.frame, this.englishLanguageButton, this.englishLanguageButtonTextField, this.englishLanguageButtonRectangle, this.englishLanguageButtonListener, this.guiLanguage);
        super.configureButton(this.frame, this.returnButton, this.returnButtonTextField, this.returnButtonRectangle, this.returnButtonListener, this.guiLanguage);
        super.configureButton(this.frame, this.createButton, this.createButtonTextField, this.createButtonRectangle, this.createButtonListener, this.guiLanguage);



        /*
        Configure labels
        */

        super.configureLabel(this.frame, this.headerLabel, this.headerLabelTextField, this.headerLabelRectangle,this.headerLabelFont, this.guiLanguage);
        super.configureLabel(this.frame, this.nameLabel, this.nameLabelTextField, this.nameLabelRectangle,this.nameLabelFont, this.guiLanguage);
        super.configureLabel(this.frame, this.playersNumberLabel, this.playersNumberLabelTextField, this.playersNumberLabelRectangle,this.playersNumberLabelFont, this.guiLanguage);
        super.configureLabel(this.frame, this.passwordLabel, this.passwordLabelTextField, this.passwordLabelRectangle,this.passwordLabelFont, this.guiLanguage);
        super.configureLabel(this.frame, this.enterPasswordLabel, this.enterPasswordLabelTextField, this.enterPasswordLabelRectangle,this.enterPasswordLabelFont, this.guiLanguage);


        /*
        Configure text input fields
         */
        super.configureTextField(this.frame, this.nameTextField, this.nameTextFieldRectangle, this.nameTextFieldListener);
        super.configureTextField(this.frame, this.enterPasswordTextField, this.enterPasswordTextFieldRectangle, this.enterPasswordTextFieldListener);


        /*
        Configure combo boxes fields
         */
        super.configureComboBox(this.frame, this.playersNumberComboBox, this.playersNumberComboBoxRectangle);
        super.configureComboBox(this.frame, this.passwordComboBox, this.passwordComboBoxRectangle, this.passwordComboBoxListener);



        /*
        Configure frame
         */
        super.configureFrame(this.frame, FRAME_TITLE, FRAME_WIDTH, FRAME_HEIGHT);

    }


}