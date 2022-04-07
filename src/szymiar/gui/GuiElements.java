package szymiar.gui;

import java.io.Serializable;

public class GuiElements implements Serializable {

    public enum guiTextField{
        LOGIN, REGISTER, POLISH_LANGUAGE, ENGLISH_LANGUAGE, START_GAME ,
        LEAVE_GAME, CREATE_GAME, JOIN_GAME, CREDITS, CONFIRM , CREATE ,
        PROFILE, FRIENDS, LOG_OUT,

        CREATE_GAME_VIEW_HEADER , RESET_PASSWORD_VIEW_HEADER, REGISTER_VIEW_HEADER ,
        LOGIN_VIEW_HEADER, START_VIEW_HEADER , CREDITS_VIEW_HEADER,

        PASSWORD, REPEAT_PASSWORD, USERNAME, EMAIL, USERNAME_EMAIL,
        NEW_PASSWORD, ENTER_PASSWORD ,  NAME, PLAYERS_NUMBER ,

        YES, NO , ONE, TWO , THREE , FOUR,

        HELLO , YOUR_LEVEL, EMPTY

    }

    public enum guiLanguage{
        POLISH, ENGLISH
    }

    public enum guiViewType{
        START, GAME, LOGIN, REGISTER, JOIN_GAME, CREATE_GAME, PROFILE, CREDITS, FRIENDS,
        GAME_LOBBY, RESET_PASSWORD
    }

    public enum userType{
        LOGGED, ANONYMOUS, OWNER, JOINER
    }


}
