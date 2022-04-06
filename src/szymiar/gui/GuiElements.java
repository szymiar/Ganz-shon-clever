package szymiar.gui;

import java.io.Serializable;

public class GuiElements implements Serializable {

    public enum guiTextField{
        LOGIN, REGISTER, POLISH_LANGUAGE, ENGLISH_LANGUAGE,
        CREATE_GAME, JOIN_GAME, START_GAME , LEAVE_GAME, EMPTY,
        CREDITS, START_VIEW_HEADER, HELLO , REGISTER_VIEW_HEADER , LOGIN_VIEW_HEADER,
        PASSWORD, REPEAT_PASSWORD, USERNAME, EMAIL, USERNAME_EMAIL, CONFIRM , RESET_PASSWORD_VIEW_HEADER,
        NEW_PASSWORD
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
