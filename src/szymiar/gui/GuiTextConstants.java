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
                }
                break;
        }
        return result;
    }


    private GuiTextConstants() {

    }
}
