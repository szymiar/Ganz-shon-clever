package main.test.szymiar.gui.views;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import szymiar.gui.GuiElements;
import szymiar.gui.views.View;


public class ViewTest {

    @Test
    public void testConvertTextFieldEnums(){
        View view = new View();
        GuiElements.guiTextField[] textFields = {GuiElements.guiTextField.ONE,
        GuiElements.guiTextField.TWO, GuiElements.guiTextField.THREE, GuiElements.guiTextField.FOUR};
        GuiElements.guiLanguage language = GuiElements.guiLanguage.ENGLISH;

        String[] expectedResult = {"1","2","3","4"};
        String[] methodResult = view.convertTextFieldEnums(textFields,language);
        Assertions.assertArrayEquals(expectedResult,methodResult);
    }
}
