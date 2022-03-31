package szymiar.game;

import java.io.Serializable;

public class RoundTour implements Serializable {

    private int maxRoundNumber;
    private int maxTourNumber;
    private int roundNumber;
    private int tourNumber;

    public RoundTour(int numOfPlayers) {
        this.roundNumber = roundNumber;
        this.tourNumber = tourNumber;
        this.maxTourNumber = calculateMaxTourNumber(numOfPlayers);
        this.maxRoundNumber = calculateMaxRoundNumber(numOfPlayers);
    }

    public int getMaxRoundNumber() {
        return maxRoundNumber;
    }

    public void setMaxRoundNumber(int maxRoundNumber) {
        this.maxRoundNumber = maxRoundNumber;
    }

    public int getMaxTourNumber() {
        return maxTourNumber;
    }

    public void setMaxTourNumber(int maxTourNumber) {
        this.maxTourNumber = maxTourNumber;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public int getTourNumber() {
        return tourNumber;
    }

    public void setTourNumber(int tourNumber) {
        this.tourNumber = tourNumber;
    }

    public int calculateMaxRoundNumber(int numOfPlayers){
        int res=6;
        switch (numOfPlayers){
            case 1:
                res = 6;
                break;
            case 2:
                res = 6;
                break;
            case 3:
                res = 5;
                break;
            case 4:
                res = 4;
                break;
        }
        return res;
    }
    public int calculateMaxTourNumber(int numOfPlayers){
        int res=1;
        switch (numOfPlayers){
            case 1:
                res = 1;
                break;
            case 2:
                res = 3;
                break;
            case 3:
                res = 3;
                break;
            case 4:
                res = 3;
                break;
        }
        return res;

    }



}
