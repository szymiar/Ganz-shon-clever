package szymiar.board;

import szymiar.game.GameElements;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;



public class Dice implements Serializable {




    public GameElements.DiceColor diceColor;
    public GameElements.DiceValue diceValue;

    public Dice(GameElements.DiceColor diceColor, GameElements.DiceValue diceValue){
        this.diceColor = diceColor;
        this.diceValue = diceValue;
    }

    public Dice(GameElements.DiceColor diceColor){
        this.diceColor = diceColor;
        this.diceValue = getRandomDiceValue();

    }

    public GameElements.DiceValue getDiceValue() {
        return diceValue;
    }

    public void setDiceValue(GameElements.DiceValue diceValue) {
        this.diceValue = diceValue;
    }




    public GameElements.DiceValue getRandomDiceValue(){
        List<GameElements.DiceValue> values =
                Collections.unmodifiableList(Arrays.asList(GameElements.DiceValue.values()));
        int size = values.size();
        Random RANDOM = new Random();
        return values.get(RANDOM.nextInt(size));
    }




}
