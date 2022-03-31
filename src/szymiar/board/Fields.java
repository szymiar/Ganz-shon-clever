package szymiar.board;

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
    //private Field


    private int fieldId;
    private String fieldContent;

}
