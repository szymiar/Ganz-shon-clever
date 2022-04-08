package szymiar.gui.views;

import szymiar.gui.GuiElements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameLobbyView extends View{
    private JFrame frame;
    private GuiElements.guiViewType guiViewType;
    private GuiElements.guiLanguage guiLanguage;
    private GuiElements.userType userType;
    private final int FRAME_WIDTH = 750;
    private final int FRAME_HEIGHT = 750;
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
            GameLobbyView.super.switchView(frame, GuiElements.guiViewType.START, guiLanguage, GuiElements.userType.LOGGED );
        }
    };

    private JButton startGameButton;
    private Rectangle starGameButtonRectangle = new Rectangle(FRAME_WIDTH*1/10,FRAME_HEIGHT*8/10,150, 50);
    private GuiElements.guiTextField startGameButtonTextField = GuiElements.guiTextField.START_GAME;
    private ActionListener startGameButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            GameLobbyView.super.switchView(frame, GuiElements.guiViewType.GAME, guiLanguage, userType);
        }
    };

    private JButton discardGameButton;
    private Rectangle discardGameButtonRectangle = new Rectangle(FRAME_WIDTH*6/18,FRAME_HEIGHT*8/10,150, 50);
    private GuiElements.guiTextField discardGameButtonTextField = GuiElements.guiTextField.DISCARD_GAME;
    private ActionListener discardGameButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            GameLobbyView.super.switchView(frame, GuiElements.guiViewType.CREATE_GAME, guiLanguage, GuiElements.userType.LOGGED);
        }
    };

    private JButton invitePlayerButton;
    private Rectangle invitePlayerButtonRectangle = new Rectangle(FRAME_WIDTH*17/20,FRAME_HEIGHT*6/16,90, 40);
    private GuiElements.guiTextField invitePlayerButtonTextField = GuiElements.guiTextField.INVITE;
    private ActionListener invitePlayerButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            System.out.println("Invite player");
        }
    };


    private JButton inviteFriendButton;
    private Rectangle inviteFriendButtonRectangle = new Rectangle(FRAME_WIDTH*17/20,FRAME_HEIGHT/10,40, 40);
    private GuiElements.guiTextField inviteFriendButtonTextField = GuiElements.guiTextField.INVITE;
    private ActionListener inviteFriendButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            System.out.println("Invite friend");
        }
    };






    private JButton polishLanguageButton;
    private Rectangle polishLanguageButtonRectangle = new Rectangle(FRAME_WIDTH*7/8,FRAME_HEIGHT/10,60, 50);
    private GuiElements.guiTextField polishLanguageButtonTextField = GuiElements.guiTextField.POLISH_LANGUAGE;
    private ActionListener polishLanguageButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            guiLanguage = GuiElements.guiLanguage.POLISH;
            GameLobbyView.super.switchView(frame, guiViewType, guiLanguage, userType );
        }
    };

    private JButton englishLanguageButton;
    private Rectangle englishLanguageButtonRectangle = new Rectangle(FRAME_WIDTH*7/8,FRAME_HEIGHT*2/10,60, 50);
    private GuiElements.guiTextField englishLanguageButtonTextField = GuiElements.guiTextField.ENGLISH_LANGUAGE;
    private ActionListener englishLanguageButtonListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            guiLanguage = GuiElements.guiLanguage.ENGLISH;
            GameLobbyView.super.switchView(frame, guiViewType, guiLanguage, userType );
        }
    };



    /*
    JLabels configuration options
     */
    private final int HEADER_HEIGHT = 130;
    private final int HEADER_WIDTH = 200;
    private final int HELLO_LABEL_HEIGHT = 70;
    private final int HELLO_LABEL_WIDTH = 230;

    // label.setHorizontalAlignment(JLabel.CENTER);

    private JLabel headerLabel;
    private Rectangle headerLabelRectangle = new Rectangle(FRAME_WIDTH/10, FRAME_HEIGHT/5, HEADER_WIDTH, HEADER_HEIGHT );
    private GuiElements.guiTextField headerLabelTextField = GuiElements.guiTextField.GAME_LOBBY_HEADER;
    private Font headerLabelFont = new Font("Calibri", Font.BOLD, 32);

    private JLabel invitePlayerLabel;
    private Rectangle invitePlayerLabelRectangle = new Rectangle(FRAME_WIDTH*1/2, FRAME_HEIGHT/4, HEADER_WIDTH*8/10, HEADER_HEIGHT*8/10  );
    private GuiElements.guiTextField invitePlayerLabelTextField = GuiElements.guiTextField.INVITE_PLAYER;
    private Font invitePlayerLabelFont = new Font("Calibri", Font.BOLD, 24);


    private JLabel inviteFriendLabel;
    private Rectangle inviteFriendLabelRectangle = new Rectangle(FRAME_WIDTH*1/2, FRAME_HEIGHT*1/2, HEADER_WIDTH*8/10, HEADER_HEIGHT*8/10  );
    private GuiElements.guiTextField inviteFriendLabelTextField = GuiElements.guiTextField.INVITE_FRIEND;
    private Font inviteFriendLabelFont = new Font("Calibri", Font.BOLD, 24);


    private JLabel enterUserEmailLabel;
    private Rectangle enterUserEmailLabelRectangle = new Rectangle(FRAME_WIDTH*10/20, FRAME_HEIGHT*6/16, HEADER_WIDTH*7/10, HEADER_HEIGHT*4/10  );
    private GuiElements.guiTextField enterUserEmailLabelTextField = GuiElements.guiTextField.ENTER_USERNAME_EMAIL;
    private Font enterUserEmailLabelFont = new Font("Calibri", Font.BOLD, 18);


    /*
    Text input fields configuration options
     */

    private JTextField enterUserEmailTextField;
    private Rectangle enterUserEmailTextFieldRectangle = new Rectangle(FRAME_WIDTH*14/20, FRAME_HEIGHT * 6/16, HEADER_WIDTH*7/20, HEADER_HEIGHT*3/10);
    private ActionListener enterUserEmailTextFieldListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            System.out.println("Inserting username");
        }
    };



    /*
    JTable
    */
    private JTable playersTable;
    private Rectangle playerTableRectangle = new Rectangle(FRAME_WIDTH/10, FRAME_HEIGHT/4, FRAME_WIDTH*3/10, FRAME_HEIGHT*3/10);




    public GameLobbyView(JFrame frame, GuiElements.guiLanguage language , GuiElements.userType userType){
        super();
        this.frame = frame;
        this.guiLanguage = language;
        this.guiViewType = GuiElements.guiViewType.GAME_LOBBY;
        this.userType = userType;
        this.returnButton = new JButton();
        this.englishLanguageButton = new JButton();
        this.polishLanguageButton = new JButton();
        this.startGameButton = new JButton();
        this.discardGameButton = new JButton();
        this.inviteFriendButton = new JButton();
        this.invitePlayerButton = new JButton();
        this.enterUserEmailLabel = new JLabel();
        this.headerLabel = new JLabel();
        this.inviteFriendLabel = new JLabel();
        this.invitePlayerLabel = new JLabel();
        this.enterUserEmailTextField = new JTextField();
        this.playersTable = new JTable();
    }


    public void configure(){
        super.configure(this.frame);

        /*
        Configure buttons
         */
        super.configureButton(this.frame, this.polishLanguageButton, this.polishLanguageButtonTextField, this.polishLanguageButtonRectangle, this.polishLanguageButtonListener, this.guiLanguage);
        super.configureButton(this.frame, this.englishLanguageButton, this.englishLanguageButtonTextField, this.englishLanguageButtonRectangle, this.englishLanguageButtonListener, this.guiLanguage);
        super.configureButton(this.frame, this.returnButton, this.returnButtonTextField, this.returnButtonRectangle, this.returnButtonListener, this.guiLanguage);
        super.configureButton(this.frame, this.startGameButton, this.startGameButtonTextField, this.starGameButtonRectangle, this.startGameButtonListener, this.guiLanguage);
        super.configureButton(this.frame, this.discardGameButton, this.discardGameButtonTextField, this.discardGameButtonRectangle, this.discardGameButtonListener, this.guiLanguage);
        //super.configureButton(this.frame, this.inviteFriendButton, this.inviteFriendButtonTextField, this.inviteFriendButtonRectangle, this.inviteFriendButtonListener, this.guiLanguage);
        super.configureButton(this.frame, this.invitePlayerButton, this.invitePlayerButtonTextField, this.invitePlayerButtonRectangle, this.invitePlayerButtonListener, this.guiLanguage);


        /*
        Configure labels TUTAJ
         */
        super.configureLabel(this.frame, this.headerLabel, this.headerLabelTextField, this.headerLabelRectangle, this.headerLabelFont, this.guiLanguage);
        super.configureLabel(this.frame, this.inviteFriendLabel, this.inviteFriendLabelTextField, this.inviteFriendLabelRectangle, this.inviteFriendLabelFont, this.guiLanguage);
        super.configureLabel(this.frame, this.invitePlayerLabel, this.invitePlayerLabelTextField, this.invitePlayerLabelRectangle, this.invitePlayerLabelFont, this.guiLanguage);
        super.configureLabel(this.frame, this.enterUserEmailLabel, this.enterUserEmailLabelTextField, this.enterUserEmailLabelRectangle, this.enterUserEmailLabelFont, this.guiLanguage);


        /*
        Configure text input fields
         */
        super.configureTextField(this.frame, this.enterUserEmailTextField, this.enterUserEmailTextFieldRectangle, this.enterUserEmailTextFieldListener);
        /*
        Configure frame
         */

        this.playersTable.setBounds(this.playerTableRectangle);
        this.frame.add(this.playersTable);
        super.configureFrame(this.frame, FRAME_TITLE, FRAME_WIDTH, FRAME_HEIGHT);

    }
}
