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
    private Field yellowField4 = new Field(4, GameElements.FieldValue.X, GameElements.FieldColor.YELLOW, GameElements.FieldBonus.NONE, GameElements.FieldCondition.EQUALS);
    private Field yellowField5 = new Field(5, GameElements.FieldValue.TWO, GameElements.FieldColor.YELLOW, GameElements.FieldBonus.NONE, GameElements.FieldCondition.EQUALS);
    private Field yellowField6 = new Field(6, GameElements.FieldValue.ONE, GameElements.FieldColor.YELLOW, GameElements.FieldBonus.NONE, GameElements.FieldCondition.EQUALS);
    private Field yellowField7 = new Field(7, GameElements.FieldValue.X, GameElements.FieldColor.YELLOW, GameElements.FieldBonus.NONE, GameElements.FieldCondition.EQUALS);
    private Field yellowField8 = new Field(8, GameElements.FieldValue.FIVE, GameElements.FieldColor.YELLOW, GameElements.FieldBonus.NONE, GameElements.FieldCondition.EQUALS);
    private Field yellowField9 = new Field(9, GameElements.FieldValue.ONE, GameElements.FieldColor.YELLOW, GameElements.FieldBonus.NONE, GameElements.FieldCondition.EQUALS);
    private Field yellowField10 = new Field(10, GameElements.FieldValue.X, GameElements.FieldColor.YELLOW, GameElements.FieldBonus.NONE, GameElements.FieldCondition.EQUALS);
    private Field yellowField11 = new Field(11, GameElements.FieldValue.TWO, GameElements.FieldColor.YELLOW, GameElements.FieldBonus.NONE, GameElements.FieldCondition.EQUALS);
    private Field yellowField12 = new Field(12, GameElements.FieldValue.FOUR, GameElements.FieldColor.YELLOW, GameElements.FieldBonus.NONE, GameElements.FieldCondition.EQUALS);
    private Field yellowField13 = new Field(13, GameElements.FieldValue.X, GameElements.FieldColor.YELLOW, GameElements.FieldBonus.NONE, GameElements.FieldCondition.EQUALS);
    private Field yellowField14 = new Field(14, GameElements.FieldValue.THREE, GameElements.FieldColor.YELLOW, GameElements.FieldBonus.NONE, GameElements.FieldCondition.EQUALS);
    private Field yellowField15 = new Field(15, GameElements.FieldValue.FOUR, GameElements.FieldColor.YELLOW, GameElements.FieldBonus.NONE, GameElements.FieldCondition.EQUALS);
    private Field yellowField16 = new Field(16, GameElements.FieldValue.SIX, GameElements.FieldColor.YELLOW, GameElements.FieldBonus.NONE, GameElements.FieldCondition.EQUALS);



    private Field blueField17 = new Field(17, GameElements.FieldValue.TWO, GameElements.FieldColor.BLUE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.SUM_EQUALS);
    private Field blueField18 = new Field(18, GameElements.FieldValue.THREE, GameElements.FieldColor.BLUE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.SUM_EQUALS);
    private Field blueField19 = new Field(19, GameElements.FieldValue.FOUR, GameElements.FieldColor.BLUE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.SUM_EQUALS);
    private Field blueField20 = new Field(20, GameElements.FieldValue.FIVE, GameElements.FieldColor.BLUE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.SUM_EQUALS);
    private Field blueField21 = new Field(21, GameElements.FieldValue.SIX, GameElements.FieldColor.BLUE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.SUM_EQUALS);
    private Field blueField22 = new Field(22, GameElements.FieldValue.SEVEN, GameElements.FieldColor.BLUE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.SUM_EQUALS);
    private Field blueField23 = new Field(23, GameElements.FieldValue.EIGHT, GameElements.FieldColor.BLUE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.SUM_EQUALS);
    private Field blueField24 = new Field(24, GameElements.FieldValue.NINE, GameElements.FieldColor.BLUE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.SUM_EQUALS);
    private Field blueField25 = new Field(25, GameElements.FieldValue.TEN, GameElements.FieldColor.BLUE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.SUM_EQUALS);
    private Field blueField26 = new Field(26, GameElements.FieldValue.ELEVEN, GameElements.FieldColor.BLUE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.SUM_EQUALS);
    private Field blueField27 = new Field(27, GameElements.FieldValue.TWELVE, GameElements.FieldColor.BLUE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.SUM_EQUALS);



    private Field greenField28 = new Field(28, GameElements.FieldValue.EMPTY, GameElements.FieldColor.GREEN, GameElements.FieldBonus.NONE, GameElements.FieldCondition.GREATER_ONE);
    private Field greenField29 = new Field(29, GameElements.FieldValue.EMPTY, GameElements.FieldColor.GREEN, GameElements.FieldBonus.NONE, GameElements.FieldCondition.GREATER_TWO);
    private Field greenField30 = new Field(30, GameElements.FieldValue.EMPTY, GameElements.FieldColor.GREEN, GameElements.FieldBonus.NONE, GameElements.FieldCondition.GREATER_THREE);
    private Field greenField31 = new Field(31, GameElements.FieldValue.EMPTY, GameElements.FieldColor.GREEN, GameElements.FieldBonus.EXTRA_DICE, GameElements.FieldCondition.GREATER_FOUR);
    private Field greenField32 = new Field(32, GameElements.FieldValue.EMPTY, GameElements.FieldColor.GREEN, GameElements.FieldBonus.NONE, GameElements.FieldCondition.GREATER_FIVE);
    private Field greenField33 = new Field(33, GameElements.FieldValue.EMPTY, GameElements.FieldColor.GREEN, GameElements.FieldBonus.BLUE_X, GameElements.FieldCondition.GREATER_ONE);
    private Field greenField34 = new Field(34, GameElements.FieldValue.EMPTY, GameElements.FieldColor.GREEN, GameElements.FieldBonus.FOX, GameElements.FieldCondition.GREATER_TWO);
    private Field greenField35 = new Field(35, GameElements.FieldValue.EMPTY, GameElements.FieldColor.GREEN, GameElements.FieldBonus.NONE, GameElements.FieldCondition.GREATER_THREE);
    private Field greenField36 = new Field(36, GameElements.FieldValue.EMPTY, GameElements.FieldColor.GREEN, GameElements.FieldBonus.VIOLET_SIX, GameElements.FieldCondition.GREATER_FOUR);
    private Field greenField37 = new Field(37, GameElements.FieldValue.EMPTY, GameElements.FieldColor.GREEN, GameElements.FieldBonus.EXTRA_THROW, GameElements.FieldCondition.GREATER_FIVE);
    private Field greenField38 = new Field(38, GameElements.FieldValue.EMPTY, GameElements.FieldColor.GREEN, GameElements.FieldBonus.NONE, GameElements.FieldCondition.GREATER_SIX);



    private Field orangeField39 = new Field(39, GameElements.FieldValue.EMPTY, GameElements.FieldColor.ORANGE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.NONE);
    private Field orangeField40 = new Field(40, GameElements.FieldValue.EMPTY, GameElements.FieldColor.ORANGE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.FILLED_PREVIOUS);
    private Field orangeField41 = new Field(41, GameElements.FieldValue.EMPTY, GameElements.FieldColor.ORANGE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.FILLED_PREVIOUS);
    private Field orangeField42 = new Field(42, GameElements.FieldValue.EMPTY, GameElements.FieldColor.ORANGE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.FILLED_PREVIOUS);
    private Field orangeField43 = new Field(43, GameElements.FieldValue.EMPTY, GameElements.FieldColor.ORANGE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.FILLED_PREVIOUS);
    private Field orangeField44 = new Field(44, GameElements.FieldValue.EMPTY, GameElements.FieldColor.ORANGE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.FILLED_PREVIOUS);
    private Field orangeField45 = new Field(45, GameElements.FieldValue.EMPTY, GameElements.FieldColor.ORANGE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.FILLED_PREVIOUS);
    private Field orangeField46 = new Field(46, GameElements.FieldValue.EMPTY, GameElements.FieldColor.ORANGE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.FILLED_PREVIOUS);
    private Field orangeField47 = new Field(47, GameElements.FieldValue.EMPTY, GameElements.FieldColor.ORANGE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.FILLED_PREVIOUS);
    private Field orangeField48 = new Field(48, GameElements.FieldValue.EMPTY, GameElements.FieldColor.ORANGE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.FILLED_PREVIOUS);
    private Field orangeField49 = new Field(49, GameElements.FieldValue.EMPTY, GameElements.FieldColor.ORANGE, GameElements.FieldBonus.NONE, GameElements.FieldCondition.FILLED_PREVIOUS);



    private Field violetField50 = new Field(50, GameElements.FieldValue.EMPTY, GameElements.FieldColor.VIOLET, GameElements.FieldBonus.NONE, GameElements.FieldCondition.NONE);
    private Field violetField51 = new Field(51, GameElements.FieldValue.EMPTY, GameElements.FieldColor.VIOLET, GameElements.FieldBonus.NONE, GameElements.FieldCondition.GREATER_PREVIOUS);
    private Field violetField52 = new Field(52, GameElements.FieldValue.EMPTY, GameElements.FieldColor.VIOLET, GameElements.FieldBonus.EXTRA_THROW, GameElements.FieldCondition.GREATER_PREVIOUS);
    private Field violetField53 = new Field(53, GameElements.FieldValue.EMPTY, GameElements.FieldColor.VIOLET, GameElements.FieldBonus.BLUE_X, GameElements.FieldCondition.GREATER_PREVIOUS);
    private Field violetField54 = new Field(54, GameElements.FieldValue.EMPTY, GameElements.FieldColor.VIOLET, GameElements.FieldBonus.EXTRA_DICE, GameElements.FieldCondition.GREATER_PREVIOUS);
    private Field violetField55 = new Field(55, GameElements.FieldValue.EMPTY, GameElements.FieldColor.VIOLET, GameElements.FieldBonus.YELLOW_X, GameElements.FieldCondition.GREATER_PREVIOUS);
    private Field violetField56 = new Field(56, GameElements.FieldValue.EMPTY, GameElements.FieldColor.VIOLET, GameElements.FieldBonus.FOX, GameElements.FieldCondition.GREATER_PREVIOUS);
    private Field violetField57 = new Field(57, GameElements.FieldValue.EMPTY, GameElements.FieldColor.VIOLET, GameElements.FieldBonus.EXTRA_THROW, GameElements.FieldCondition.GREATER_PREVIOUS);
    private Field violetField58 = new Field(58, GameElements.FieldValue.EMPTY, GameElements.FieldColor.VIOLET, GameElements.FieldBonus.GREEN_X, GameElements.FieldCondition.GREATER_PREVIOUS);
    private Field violetField59 = new Field(59, GameElements.FieldValue.EMPTY, GameElements.FieldColor.VIOLET, GameElements.FieldBonus.ORANGE_SIX, GameElements.FieldCondition.GREATER_PREVIOUS);
    private Field violetField60 = new Field(60, GameElements.FieldValue.EMPTY, GameElements.FieldColor.VIOLET, GameElements.FieldBonus.EXTRA_DICE, GameElements.FieldCondition.GREATER_PREVIOUS);


    public Fields() {
    }

    public Field getYellowField1() {
        return yellowField1;
    }

    public void setYellowField1(Field yellowField1) {
        this.yellowField1 = yellowField1;
    }

    public Field getYellowField2() {
        return yellowField2;
    }

    public void setYellowField2(Field yellowField2) {
        this.yellowField2 = yellowField2;
    }

    public Field getYellowField3() {
        return yellowField3;
    }

    public void setYellowField3(Field yellowField3) {
        this.yellowField3 = yellowField3;
    }

    public Field getYellowField4() {
        return yellowField4;
    }

    public void setYellowField4(Field yellowField4) {
        this.yellowField4 = yellowField4;
    }

    public Field getYellowField5() {
        return yellowField5;
    }

    public void setYellowField5(Field yellowField5) {
        this.yellowField5 = yellowField5;
    }

    public Field getYellowField6() {
        return yellowField6;
    }

    public void setYellowField6(Field yellowField6) {
        this.yellowField6 = yellowField6;
    }

    public Field getYellowField7() {
        return yellowField7;
    }

    public void setYellowField7(Field yellowField7) {
        this.yellowField7 = yellowField7;
    }

    public Field getYellowField8() {
        return yellowField8;
    }

    public void setYellowField8(Field yellowField8) {
        this.yellowField8 = yellowField8;
    }

    public Field getYellowField9() {
        return yellowField9;
    }

    public void setYellowField9(Field yellowField9) {
        this.yellowField9 = yellowField9;
    }

    public Field getYellowField10() {
        return yellowField10;
    }

    public void setYellowField10(Field yellowField10) {
        this.yellowField10 = yellowField10;
    }

    public Field getYellowField11() {
        return yellowField11;
    }

    public void setYellowField11(Field yellowField11) {
        this.yellowField11 = yellowField11;
    }

    public Field getYellowField12() {
        return yellowField12;
    }

    public void setYellowField12(Field yellowField12) {
        this.yellowField12 = yellowField12;
    }

    public Field getYellowField13() {
        return yellowField13;
    }

    public void setYellowField13(Field yellowField13) {
        this.yellowField13 = yellowField13;
    }

    public Field getYellowField14() {
        return yellowField14;
    }

    public void setYellowField14(Field yellowField14) {
        this.yellowField14 = yellowField14;
    }

    public Field getYellowField15() {
        return yellowField15;
    }

    public void setYellowField15(Field yellowField15) {
        this.yellowField15 = yellowField15;
    }

    public Field getYellowField16() {
        return yellowField16;
    }

    public void setYellowField16(Field yellowField16) {
        this.yellowField16 = yellowField16;
    }

    public Field getBlueField17() {
        return blueField17;
    }

    public void setBlueField17(Field blueField17) {
        this.blueField17 = blueField17;
    }

    public Field getBlueField18() {
        return blueField18;
    }

    public void setBlueField18(Field blueField18) {
        this.blueField18 = blueField18;
    }

    public Field getBlueField19() {
        return blueField19;
    }

    public void setBlueField19(Field blueField19) {
        this.blueField19 = blueField19;
    }

    public Field getBlueField20() {
        return blueField20;
    }

    public void setBlueField20(Field blueField20) {
        this.blueField20 = blueField20;
    }

    public Field getBlueField21() {
        return blueField21;
    }

    public void setBlueField21(Field blueField21) {
        this.blueField21 = blueField21;
    }

    public Field getBlueField22() {
        return blueField22;
    }

    public void setBlueField22(Field blueField22) {
        this.blueField22 = blueField22;
    }

    public Field getBlueField23() {
        return blueField23;
    }

    public void setBlueField23(Field blueField23) {
        this.blueField23 = blueField23;
    }

    public Field getBlueField24() {
        return blueField24;
    }

    public void setBlueField24(Field blueField24) {
        this.blueField24 = blueField24;
    }

    public Field getBlueField25() {
        return blueField25;
    }

    public void setBlueField25(Field blueField25) {
        this.blueField25 = blueField25;
    }

    public Field getBlueField26() {
        return blueField26;
    }

    public void setBlueField26(Field blueField26) {
        this.blueField26 = blueField26;
    }

    public Field getBlueField27() {
        return blueField27;
    }

    public void setBlueField27(Field blueField27) {
        this.blueField27 = blueField27;
    }

    public Field getGreenField28() {
        return greenField28;
    }

    public void setGreenField28(Field greenField28) {
        this.greenField28 = greenField28;
    }

    public Field getGreenField29() {
        return greenField29;
    }

    public void setGreenField29(Field greenField29) {
        this.greenField29 = greenField29;
    }

    public Field getGreenField30() {
        return greenField30;
    }

    public void setGreenField30(Field greenField30) {
        this.greenField30 = greenField30;
    }

    public Field getGreenField31() {
        return greenField31;
    }

    public void setGreenField31(Field greenField31) {
        this.greenField31 = greenField31;
    }

    public Field getGreenField32() {
        return greenField32;
    }

    public void setGreenField32(Field greenField32) {
        this.greenField32 = greenField32;
    }

    public Field getGreenField33() {
        return greenField33;
    }

    public void setGreenField33(Field greenField33) {
        this.greenField33 = greenField33;
    }

    public Field getGreenField34() {
        return greenField34;
    }

    public void setGreenField34(Field greenField34) {
        this.greenField34 = greenField34;
    }

    public Field getGreenField35() {
        return greenField35;
    }

    public void setGreenField35(Field greenField35) {
        this.greenField35 = greenField35;
    }

    public Field getGreenField36() {
        return greenField36;
    }

    public void setGreenField36(Field greenField36) {
        this.greenField36 = greenField36;
    }

    public Field getGreenField37() {
        return greenField37;
    }

    public void setGreenField37(Field greenField37) {
        this.greenField37 = greenField37;
    }

    public Field getGreenField38() {
        return greenField38;
    }

    public void setGreenField38(Field greenField38) {
        this.greenField38 = greenField38;
    }

    public Field getOrangeField39() {
        return orangeField39;
    }

    public void setOrangeField39(Field orangeField39) {
        this.orangeField39 = orangeField39;
    }

    public Field getOrangeField40() {
        return orangeField40;
    }

    public void setOrangeField40(Field orangeField40) {
        this.orangeField40 = orangeField40;
    }

    public Field getOrangeField41() {
        return orangeField41;
    }

    public void setOrangeField41(Field orangeField41) {
        this.orangeField41 = orangeField41;
    }

    public Field getOrangeField42() {
        return orangeField42;
    }

    public void setOrangeField42(Field orangeField42) {
        this.orangeField42 = orangeField42;
    }

    public Field getOrangeField43() {
        return orangeField43;
    }

    public void setOrangeField43(Field orangeField43) {
        this.orangeField43 = orangeField43;
    }

    public Field getOrangeField44() {
        return orangeField44;
    }

    public void setOrangeField44(Field orangeField44) {
        this.orangeField44 = orangeField44;
    }

    public Field getOrangeField45() {
        return orangeField45;
    }

    public void setOrangeField45(Field orangeField45) {
        this.orangeField45 = orangeField45;
    }

    public Field getOrangeField46() {
        return orangeField46;
    }

    public void setOrangeField46(Field orangeField46) {
        this.orangeField46 = orangeField46;
    }

    public Field getOrangeField47() {
        return orangeField47;
    }

    public void setOrangeField47(Field orangeField47) {
        this.orangeField47 = orangeField47;
    }

    public Field getOrangeField48() {
        return orangeField48;
    }

    public void setOrangeField48(Field orangeField48) {
        this.orangeField48 = orangeField48;
    }

    public Field getOrangeField49() {
        return orangeField49;
    }

    public void setOrangeField49(Field orangeField49) {
        this.orangeField49 = orangeField49;
    }

    public Field getVioletField50() {
        return violetField50;
    }

    public void setVioletField50(Field violetField50) {
        this.violetField50 = violetField50;
    }

    public Field getVioletField51() {
        return violetField51;
    }

    public void setVioletField51(Field violetField51) {
        this.violetField51 = violetField51;
    }

    public Field getVioletField52() {
        return violetField52;
    }

    public void setVioletField52(Field violetField52) {
        this.violetField52 = violetField52;
    }

    public Field getVioletField53() {
        return violetField53;
    }

    public void setVioletField53(Field violetField53) {
        this.violetField53 = violetField53;
    }

    public Field getVioletField54() {
        return violetField54;
    }

    public void setVioletField54(Field violetField54) {
        this.violetField54 = violetField54;
    }

    public Field getVioletField55() {
        return violetField55;
    }

    public void setVioletField55(Field violetField55) {
        this.violetField55 = violetField55;
    }

    public Field getVioletField56() {
        return violetField56;
    }

    public void setVioletField56(Field violetField56) {
        this.violetField56 = violetField56;
    }

    public Field getVioletField57() {
        return violetField57;
    }

    public void setVioletField57(Field violetField57) {
        this.violetField57 = violetField57;
    }

    public Field getVioletField58() {
        return violetField58;
    }

    public void setVioletField58(Field violetField58) {
        this.violetField58 = violetField58;
    }

    public Field getVioletField59() {
        return violetField59;
    }

    public void setVioletField59(Field violetField59) {
        this.violetField59 = violetField59;
    }

    public Field getVioletField60() {
        return violetField60;
    }

    public void setVioletField60(Field violetField60) {
        this.violetField60 = violetField60;
    }
}
