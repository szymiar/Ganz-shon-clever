package szymiar.gui.views;

import sun.java2d.cmm.Profile;
import szymiar.game.GameState;
import szymiar.gui.GuiElements;
import szymiar.gui.GuiTextConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View {
    private JFrame frame;
    //private JPanel panel;
    private GuiElements.guiLanguage guiLanguage;

    private GuiElements.guiViewType guiViewType;

    public View(){
        this.guiLanguage = GuiElements.guiLanguage.ENGLISH;
        this.guiViewType = GuiElements.guiViewType.START;
    }

    public View(JFrame frame){
        this.guiLanguage = GuiElements.guiLanguage.ENGLISH;
        this.guiViewType = GuiElements.guiViewType.START;
        this.frame = frame;
    }

    public View(JFrame frame,GuiElements.guiViewType guiViewType){
        this.guiLanguage = GuiElements.guiLanguage.ENGLISH;
        this.guiViewType = guiViewType;
        this.frame = frame;
    }
    public View(JFrame frame,GuiElements.guiLanguage language){
        this.guiLanguage = language;
        this.guiViewType = GuiElements.guiViewType.START;
        this.frame = frame;
    }
    public View(JFrame frame,GuiElements.guiLanguage language, GuiElements.guiViewType guiViewType){
        this.guiViewType = guiViewType;
        this.guiLanguage = language;
        this.frame = frame;
    }

    public void switchView(JFrame frame , GuiElements.guiViewType guiViewType, GuiElements.guiLanguage guiLanguage){
        close(frame);
        switch(guiViewType){
            case START:
                StartView startView = new StartView(frame, guiLanguage);
                startView.configure();
                run(frame);
                break;
            case CREATE_GAME:
                CreateGameView createGameView = new CreateGameView(frame, guiLanguage);
                createGameView.configure();
                run(frame);
                break;
            case GAME:
                GameView gameView = new GameView(frame);
                gameView.configure();
                run(frame);
                break;
            case LOGIN:
                LoginView loginView = new LoginView(frame, guiLanguage);
                loginView.configure();
                run(frame);
                break;
            case REGISTER:
                RegisterView registerView = new RegisterView(frame, guiLanguage);
                registerView.configure();
                run(frame);
                break;
            case JOIN_GAME:
                JoinGameView joinGameView = new JoinGameView(frame, guiLanguage);
                joinGameView.configure();
                run(frame);
                break;
            case CREDITS:
                CreditsView creditsView = new CreditsView(frame, guiLanguage);
                creditsView.configure();
                run(frame);
                break;
            case FRIENDS:
                FriendsView friendsView = new FriendsView(frame, guiLanguage);
                friendsView.configure();
                run(frame);
                break;
            case GAME_LOBBY:
                GameLobbyView gameLobbyView = new GameLobbyView(frame, guiLanguage);
                gameLobbyView.configure();
                run(frame);
                break;
            case PROFILE:
                ProfileView profileView = new ProfileView(frame, guiLanguage);
                profileView.configure();
                run(frame);
                break;
            case RESET_PASSWORD:
                ResetPasswordView resetPasswordView = new ResetPasswordView(frame, guiLanguage);
                resetPasswordView.configure();
                run(frame);
                break;
        }

    }

    public void openStartView(JFrame frame){
        StartView startView =  new StartView(frame, this.guiLanguage);
        startView.configure();
        run(frame);
    }


    public void configure(JFrame frame){
        try{
            frame.getContentPane().removeAll();
        }
        catch(NullPointerException e){
            //Change to LOGGER
            System.out.println(e.getMessage());
        }
    }

    public void run(JFrame frame){
        frame.setVisible(true);
    }

    public void close(JFrame frame){

        frame.setVisible(false);
    }

    public void update(GameState gameState){
        //update
    }

    public void changeLanguage(JFrame frame, GuiElements.guiLanguage language){
        this.guiLanguage = language;
        reload(frame);
    }

    public void reload(JFrame frame){
        close(frame);
        configure(frame);
        run(frame);
    }

    public void configureButton(JFrame f, JButton button, GuiElements.guiTextField textField, Rectangle rectangle,
                                ActionListener actionListener, GuiElements.guiLanguage language){
        button.setText(GuiTextConstants.getTextConstant(language, textField));
        button.setBounds(rectangle);
        button.addActionListener(actionListener);
        f.add(button);
    }

    public void configureTextField(JFrame f, JTextField textField, Rectangle rectangle,
                                ActionListener actionListener){
        textField.setBounds(rectangle);
        textField.addActionListener(actionListener);
        f.add(textField);
    }


    public void configureLabel(JFrame f, JLabel label, GuiElements.guiTextField textField, Rectangle rectangle,Font font, GuiElements.guiLanguage language){
        label.setText(GuiTextConstants.getTextConstant(language, textField));
        label.setBounds(rectangle);
        label.setFont(font);
        f.add(label);
    }



    public void configureFrame(JFrame f, String title, int width, int height){
        f.setTitle(title);
        f.setSize(width, height);
        f.setLayout(null);
    }

    public JFrame getFrame() {
        return this.frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public GuiElements.guiViewType getGuiViewType() {
        return guiViewType;
    }

    public void setGuiViewType(GuiElements.guiViewType guiViewType) {
        this.guiViewType = guiViewType;
    }

    public GuiElements.guiLanguage getGuiLanguage() {
        return guiLanguage;
    }

    public void setGuiLanguage(GuiElements.guiLanguage guiLanguage) {
        this.guiLanguage = guiLanguage;
    }
}
