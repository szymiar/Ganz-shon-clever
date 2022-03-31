package szymiar.board;

import java.io.Serializable;

public class Area implements Serializable {
    private int fieldId;
    private String fieldContent;
    public enum FieldColor {
        YELLOW, GREEN, BLUE, VIOLET, ORANGE
    }

}
