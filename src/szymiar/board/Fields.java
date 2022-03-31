package szymiar.board;

import szymiar.game.GameElements;

import java.io.Serializable;


/*
Field id convention:
1-16 yellow fields(left to right)
17-27 blue fields(left to right starting from top level
28-38 green fields
39-49 orange fields
50-60 purple fields
 */
public class Fields implements Serializable {
    private Field yellowField1 = new Field(1, GameElements.FieldValue.THREE, GameElements.FieldColor.YELLOW, GameElements.FieldBonus.NONE, GameElements.FieldCondition.EQUALS);
    private Field yellowField2 = new Field(2, GameElements.FieldValue.SIX, GameElements.FieldColor.YELLOW, GameElements.FieldBonus.NONE, GameElements.FieldCondition.EQUALS);
    private Field yellowField3 = new Field(3, GameElements.FieldValue.FIVE, GameElements.FieldColor.YELLOW, GameElements.FieldBonus.NONE, GameElements.FieldCondition.EQUALS);

   

}
