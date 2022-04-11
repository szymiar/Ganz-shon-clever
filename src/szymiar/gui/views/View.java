package szymiar.gui.views;


import szymiar.game.GameState;
import szymiar.gui.GuiElements;
import szymiar.gui.GuiTextConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View {
    private JFrame frame;
    //private JPanel panel;
    private GuiElements.guiLanguage guiLanguage;

    private GuiElements.guiViewType guiViewType;

    private GuiElements.userType userType;

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

    public void switchView(JFrame frame , GuiElements.guiViewType guiViewType, GuiElements.guiLanguage guiLanguage, GuiElements.userType userType){
        close(frame);
        switch(guiViewType){
            case START:
                StartView startView = new StartView(frame, guiLanguage , userType);
                startView.configure();
                run(frame);
                break;
            case CREATE_GAME:
                CreateGameView createGameView = new CreateGameView(frame, guiLanguage, userType);
                createGameView.configure();
                run(frame);
                break;
            case GAME:
                GameView gameView = new GameView(frame);
                gameView.configure();
                run(frame);
                break;
            case LOGIN:
                LoginView loginView = new LoginView(frame, guiLanguage, userType);
                loginView.configure();
                run(frame);
                break;
            case REGISTER:
                RegisterView registerView = new RegisterView(frame, guiLanguage, userType);
                registerView.configure();
                run(frame);
                break;
            case JOIN_GAME:
                JoinGameView joinGameView = new JoinGameView(frame, guiLanguage, userType);
                joinGameView.configure();
                run(frame);
                break;
            case CREDITS:
                CreditsView creditsView = new CreditsView(frame, guiLanguage, userType);
                creditsView.configure();
                run(frame);
                break;
            case FRIENDS:
                FriendsView friendsView = new FriendsView(frame, guiLanguage, userType);
                friendsView.configure();
                run(frame);
                break;
            case GAME_LOBBY:
                GameLobbyView gameLobbyView = new GameLobbyView(frame, guiLanguage, userType);
                gameLobbyView.configure();
                run(frame);
                break;
            case PROFILE:
                ProfileView profileView = new ProfileView(frame, guiLanguage, userType);
                profileView.configure();
                run(frame);
                break;
            case RESET_PASSWORD:
                ResetPasswordView resetPasswordView = new ResetPasswordView(frame, guiLanguage, userType);
                resetPasswordView.configure();
                run(frame);
                break;
        }

    }

    public void openStartView(JFrame frame){
        StartView startView =  new StartView(frame, this.guiLanguage, GuiElements.userType.ANONYMOUS);
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


    public void configureComboBox(JFrame f, JComboBox comboBox,  Rectangle rectangle){
        comboBox.setBounds(rectangle);
        f.add(comboBox);
    }
    public void configureComboBox(JFrame f, JComboBox comboBox,  Rectangle rectangle, ActionListener listener){
        comboBox.setBounds(rectangle);
        comboBox.addActionListener(listener);
        f.add(comboBox);
    }

    public String[] convertTextFieldEnums(GuiElements.guiTextField[] textFields, GuiElements.guiLanguage language){
        String result[] = new String[textFields.length];
        int i = 0;
        for(GuiElements.guiTextField tf : textFields){
            result[i] = GuiTextConstants.getTextConstant(language, tf);
            i++;
        }
        return result;
    }


    public void configureFrame(JFrame f, String title, int width, int height){
        f.setTitle(title);
        f.setSize(width, height);
        f.setLayout(null);
    }

    public GuiElements.userType getUserType() {
        return userType;
    }

    public void setUserType(GuiElements.userType userType) {
        this.userType = userType;
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
