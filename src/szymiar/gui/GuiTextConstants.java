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
                }
                break;
        }
        return result;
    }


    private GuiTextConstants() {

    }
}
