package szymiar.game;

import java.io.Serializable;

public class GameElements implements Serializable {

    public enum DiceColor{
        YELLOW, GREEN, BLUE, ORANGE, VIOLET, WHITE
    }
    public enum DiceValue{
        ONE, TWO, THREE, FOUR, FIVE, SIX
    }

    public enum FieldColor {
        YELLOW, GREEN, BLUE, VIOLET, ORANGE
    }

    public enum PlayerStatus{
        ACTIVE, PASSIVE
    }

    public enum FieldBonus{
        FOX, VIOLET_SIX, BLUE_X, YELLOW_X, GREEN_X, ORANGE_SIX,
        EXTRA_THROW, EXTRA_DICE, ORANGE_FOUR, ORANGE_FIVE ,
        NONE

    }

    public enum ActionBonus{
        EXTRA_THROW, EXTRA_DICE
    }

    public enum FieldValue{
        ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
        TEN, ELEVEN, TWELVE, X, EMPTY
    }

    public enum FieldCondition{
        EQUALS, GREATER_ONE, GREATER_TWO, GREATER_THREE,
        GREATER_FOUR, GREATER_FIVE, GREATER_SIX,
        GREATER_PREVIOUS , SUM_EQUALS , FILLED_PREVIOUS , NONE
    }



}
