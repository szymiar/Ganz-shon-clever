package szymiar.gui;

import java.io.Serializable;

public class GuiElements implements Serializable {

    public enum guiTextField{
        LOGIN, REGISTER, POLISH_LANGUAGE, ENGLISH_LANGUAGE,
        CREATE_GAME, JOIN_GAME, START_GAME , LEAVE_GAME
    }

    public enum guiLanguage{
        POLISH, ENGLISH
    }

}
