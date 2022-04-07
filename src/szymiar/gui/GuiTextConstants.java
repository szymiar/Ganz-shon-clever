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
                        result = "nazwa użytkownika";
                        break;
                    case EMAIL:
                        result = "email";
                        break;
                    case PASSWORD:
                        result = "hasło";
                        break;
                    case REPEAT_PASSWORD:
                        result = "powtórz hasło";
                        break;
                    case LOGIN_VIEW_HEADER:
                        result = "LOGOWANIE";
                        break;
                    case USERNAME_EMAIL:
                        result = "użytkownik/email";
                        break;
                    case CONFIRM:
                        result = "ZATWIERDŹ";
                        break;
                    case RESET_PASSWORD_VIEW_HEADER:
                        result = "ZRESETUJ HASŁO";
                        break;
                    case NEW_PASSWORD:
                        result = "nowe hasło";
                        break;
                    case ENTER_PASSWORD:
                        result = "Wprowadź hasło";
                        break;
                    case CREATE_GAME_VIEW_HEADER:
                        result = "Utwórz nową grę";
                        break;
                    case NAME:
                        result = "Nazwa";
                        break;
                    case PLAYERS_NUMBER:
                        result = "Liczba graczy";
                        break;
                    case CREATE:
                        result = "Utwórz";
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
                        result = "Twórcy";
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
                        result = "Twój poziom: ";
                        break;
                }
                break;
        }
        return result;
    }


    private GuiTextConstants() {

    }
}
