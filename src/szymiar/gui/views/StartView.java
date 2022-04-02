package szymiar.gui.views;


import szymiar.gui.GuiElements;

import javax.swing.*;




public class StartView extends View {

    private final int FRAME_WIDTH = 600;
    private final int FRAME_HEIGHT = 600;

    private JButton loginButton;
    private JButton registerButton;
    private JButton joinGameButton;
    private JButton createGameButton;
    private JButton polishLanguageButton;
    private JButton englishLanguageButton;
    private GuiElements.guiLanguage guiLanguage;
    private JFrame frame = new JFrame();


    public StartView(){
        super();
        this.guiLanguage = GuiElements.guiLanguage.ENGLISH;
    }

    public void configure(JFrame f){
        super.configure(f);

        /*
        Configure buttons
         */
        this.loginButton = new JButton();
        super.fillButton(this.loginButton, GuiElements.guiTextField.LOGIN);
        this.loginButton.setBounds(130,100,100, 40);//x axis, y axis, width, height
        f.add(this.loginButton);//adding button in JFrame

        this.registerButton = new JButton();
        super.fillButton(this.registerButton, GuiElements.guiTextField.REGISTER);
        this.registerButton.setBounds(130,180,100, 40);//x axis, y axis, width, height
        f.add(this.registerButton);//adding button in JFrame


        this.polishLanguageButton = new JButton();
        super.fillButton(this.polishLanguageButton, GuiElements.guiTextField.POLISH_LANGUAGE);
        this.polishLanguageButton.setBounds(FRAME_WIDTH*5/6,FRAME_HEIGHT/10,50, 40);//x axis, y axis, width, height
        f.add(this.polishLanguageButton);//adding button in JFrame

        this.englishLanguageButton = new JButton();
        super.fillButton(this.englishLanguageButton, GuiElements.guiTextField.ENGLISH_LANGUAGE);
        this.englishLanguageButton.setBounds(FRAME_WIDTH*5/6,FRAME_HEIGHT*2/10,50, 40);//x axis, y axis, width, height
        f.add(this.englishLanguageButton);//adding button in JFrame




        /*
        Configure frame
         */
        f.setSize(600,600);
        f.setLayout(null);
    }
}
