package szymiar.board;

import szymiar.game.GameElements;

public class Field {

    private int fieldId;
    private GameElements.FieldValue fieldValue;
    private GameElements.FieldColor fieldColor;
    private GameElements.FieldBonus fieldBonus;
    private GameElements.FieldCondition fieldCondition;

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

    public int getFieldId() {
        return fieldId;
    }

    public GameElements.FieldColor getFieldColor() {
        return fieldColor;
    }

    public GameElements.FieldBonus getFieldBonus() {
        return fieldBonus;
    }

    public GameElements.FieldCondition getFieldCondition() {
        return fieldCondition;
    }

    public void setFieldCondition(GameElements.FieldCondition fieldCondition) {
        this.fieldCondition = fieldCondition;
    }

    public GameElements.FieldValue getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(GameElements.FieldValue fieldValue) {
        this.fieldValue = fieldValue;
    }
}
