package szymiar.board;

import szymiar.game.GameElements;

public class Field {

    public int fieldId;
    public GameElements.FieldValue fieldValue;
    public GameElements.FieldColor fieldColor;
    public GameElements.FieldBonus fieldBonus;
    public GameElements.FieldCondition fieldCondition;

    public Field(int fieldId, GameElements.FieldValue fieldValue,
                 GameElements.FieldColor fieldColor,
                 GameElements.FieldBonus fieldBonus,
        GameElements.FieldCondition fieldCondition ){
        this.fieldId = fieldId;
        this.fieldValue = fieldValue;
        this.fieldColor = fieldColor;
        this.fieldBonus = fieldBonus;
        this.fieldCondition =fieldCondition;
    }

    public GameElements.FieldValue getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(GameElements.FieldValue fieldValue) {
        this.fieldValue = fieldValue;
    }
}
