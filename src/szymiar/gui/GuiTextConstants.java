package szymiar.gui;

public final class GuiTextConstants {

/*
To implement : Language packs stored in file ie XML
 */



    public static String getTextConstant(GuiElements.guiLanguage language, GuiElements.guiTextField text){
        String result = "";
        switch(language){
            case ENGLISH:
                switch (text) {
                    case LOGIN:
                        result = "Log in";
                        break;
                    case REGISTER:
                        result = "Register";
                        break;
                    case CREATE_GAME:
                        result = "Create game";
                        break;
                    case JOIN_GAME:
                        result = "Join game";
                        break;
                    case POLISH_LANGUAGE:
                        result = "PL";
                        break;
                    case ENGLISH_LANGUAGE:
                        result = "EN";
                        break;
                    case CREDITS:
                        result = "Credits";
                        break;
                    case EMPTY:
                        result = "";
                        break;
                    case START_VIEW_HEADER:
                        result = "GANZ SHON CLEVER";
                        break;
                    case HELLO:
                        result = "Welcome anonymous friend";
                        break;
                    case REGISTER_VIEW_HEADER:
                        result = "REGISTER";
                        break;
                    case USERNAME:
                        result = "username";
                        break;
                    case EMAIL:
                        result = "email";
                        break;
                    case PASSWORD:
                        result = "password";
                        break;
                    case REPEAT_PASSWORD:
                        result = "repeat password";
                        break;
                    case LOGIN_VIEW_HEADER:
                        result = "LOG IN";
                        break;
                    case USERNAME_EMAIL:
                        result = "user/email";
                        break;
                    case CONFIRM:
                        result = "CONFIRM";
                        break;
                    case RESET_PASSWORD_VIEW_HEADER:
                        result = "RESET PASSWORD";
                        break;
                    case NEW_PASSWORD:
                        result = "new password";
                        break;
                    case CREATE_GAME_VIEW_HEADER:
                        result = "Create new game";
                        break;
                    case NAME:
                        result = "Name";
                        break;
                    case PLAYERS_NUMBER:
                        result = "Players' number";
                        break;
                    case ENTER_PASSWORD:
                        result = "Enter password";
                        break;
                    case CREATE:
                        result = "CREATE";
                        break;
                    case YES:
                        result = "yes";
                        break;
                    case NO:
                        result = "no";
                        break;
                    case ONE:
                        result = "1";
                        break;
                    case TWO:
                        result = "2";
                        break;
                    case THREE:
                        result = "3";
                        break;
                    case FOUR:
                        result = "4";
                        break;
                    case CREDITS_VIEW_HEADER:
                        result = "Credits";
                        break;
                    case PROFILE:
                        result = "PROFILE";
                        break;
                    case FRIENDS:
                        result = "FRIENDS";
                        break;
                    case LOG_OUT:
                        result = "LOG OUT";
                        break;
                    case YOUR_LEVEL:
                        result = "Your level: ";
                        break;
                    case DISCARD_GAME:
                        result = "DISCARD GAME";
                        break;
                    case INVITE:
                        result = "INVITE";
                        break;
                    case START_GAME:
                        result = "START GAME";
                        break;
                    case GAME_LOBBY_HEADER:
                        result = "Players";
                        break;
                    case ENTER_USERNAME_EMAIL:
                        result = "enter user/email";
                        break;
                    case BEST_SCORE:
                        result = "best score";
                        break;
                    case GAMES_PLAYED:
                        result = "games played";
                        break;
                    case INVITE_PLAYER:
                        result = "Invite player";
                        break;
                    case INVITE_FRIEND:
                        result = "Invite friend";
                        break;
                }
                break;
            case POLISH:
                switch (text) {
                    case LOGIN:
                        result = "Zaloguj";
                        break;
                    case REGISTER:
                        result = "Utworz konto";
                        break;
                    case CREATE_GAME:
                        result = "Utworz gre";
                        break;
                    case JOIN_GAME:
                        result = "Dolacz do gry";
                        break;
                    case CREDITS:
                        result = "Credits";
                        break;
                    case POLISH_LANGUAGE:
                        result = "PL";
                        break;
                    case ENGLISH_LANGUAGE:
                        result = "EN";
                        break;
                    case EMPTY:
                        result = "";
                        break;
                    case START_VIEW_HEADER:
                        result = "GANZ SHON CLEVER";
                        break;
                    case HELLO:
                        result = "Witaj anonimowy przyjacielu";
                        break;
                    case REGISTER_VIEW_HEADER:
                        result = "REJESTRACJA";
                        break;
                    case USERNAME:
                        result = "nazwa u??ytkownika";
                        break;
                    case EMAIL:
                        result = "email";
                        break;
                    case PASSWORD:
                        result = "has??o";
                        break;
                    case REPEAT_PASSWORD:
                        result = "powt??rz has??o";
                        break;
                    case LOGIN_VIEW_HEADER:
                        result = "LOGOWANIE";
                        break;
                    case USERNAME_EMAIL:
                        result = "u??ytkownik/email";
                        break;
                    case CONFIRM:
                        result = "ZATWIERD??";
                        break;
                    case RESET_PASSWORD_VIEW_HEADER:
                        result = "ZRESETUJ HAS??O";
                        break;
                    case NEW_PASSWORD:
                        result = "nowe has??o";
                        break;
                    case ENTER_PASSWORD:
                        result = "Wprowad?? has??o";
                        break;
                    case CREATE_GAME_VIEW_HEADER:
                        result = "Utw??rz now?? gr??";
                        break;
                    case NAME:
                        result = "Nazwa";
                        break;
                    case PLAYERS_NUMBER:
                        result = "Liczba graczy";
                        break;
                    case CREATE:
                        result = "Utw??rz";
                        break;
                    case YES:
                        result = "tak";
                        break;
                    case NO:
                        result = "nie";
                        break;
                    case ONE:
                        result = "1";
                        break;
                    case TWO:
                        result = "2";
                        break;
                    case THREE:
                        result = "3";
                        break;
                    case FOUR:
                        result = "4";
                        break;
                    case CREDITS_VIEW_HEADER:
                        result = "Tw??rcy";
                        break;
                    case PROFILE:
                        result = "PROFIL";
                        break;
                    case FRIENDS:
                        result = "ZNAJOMI";
                        break;
                    case LOG_OUT:
                        result = "WYLOGUJ";
                        break;
                    case YOUR_LEVEL:
                        result = "Tw??j poziom: ";
                        break;
                    case DISCARD_GAME:
                        result = "ODRZU??";
                        break;
                    case INVITE:
                        result = "ZAPRO??";
                        break;
                    case START_GAME:
                        result = "ROZPOCZNIJ";
                        break;
                    case GAME_LOBBY_HEADER:
                        result = "Gracze";
                        break;
                    case ENTER_USERNAME_EMAIL:
                        result = "Podaj nazwe/email";
                        break;
                    case BEST_SCORE:
                        result = "najlepszy wynik";
                        break;
                    case GAMES_PLAYED:
                        result = "rozegrane gry";
                        break;
                    case INVITE_PLAYER:
                        result = "Zapro?? gracza";
                        break;
                    case INVITE_FRIEND:
                        result = "Zapro?? znajomego";
                        break;
                }
                break;
        }
        return result;
    }


    private GuiTextConstants() {

    }
}
