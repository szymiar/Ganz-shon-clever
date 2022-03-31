package szymiar.board;

import java.io.Serializable;

public class Points implements Serializable {
    public int yellowPoints;
    public int greenPoints;
    public int orangePoints;
    public int bluePoints;
    public int violetPoints;
    public int totalSum;
    public int bonusPoints;

    public Points(Fields fields){
        this.yellowPoints = getYellowPoints(fields);
        this.greenPoints = getGreenPoints(fields);
        this.orangePoints = getOrangePoints(fields);
        this.bluePoints = getBluePoints(fields);
        this.violetPoints = getVioletPoints(fields);
        this.bonusPoints = getBonusPoints(fields);
        this.totalSum = yellowPoints + greenPoints +
                orangePoints + bluePoints + violetPoints +
                bonusPoints;
    }

    public int getYellowPoints(Fields fields){
        /*
        Logic
         */
        return 0;
    }
    public int getBluePoints(Fields fields){
         /*
        Logic
         */
        return 0;
    }
    public int getGreenPoints(Fields fields){
         /*
        Logic
         */
        return 0;
    }
    public int getOrangePoints(Fields fields){
         /*
        Logic
         */
        return 0;
    }
    public int getVioletPoints(Fields fields){
         /*
        Logic
         */
        return 0;
    }
    public int getBonusPoints(Fields fields){
         /*
        Logic
         */
        return 0;
    }
}
