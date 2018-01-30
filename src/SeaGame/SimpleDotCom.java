package SeaGame;

/**
 * Created by Natali on 30.01.2018.
 */
public class SimpleDotCom {

    int[] locationCells; // массив для хранения адреса ячеек
    int numOfHits = 0; // к-тво попаданий

    String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";

        for(int cell: locationCells){
            if(guess == cell){
                result = "Попал";
                numOfHits++;
                break;
            }
        }

        if(numOfHits == locationCells.length){
            result = "Потопил";
        }

        System.out.println(result);
        return result;
    }

    void setLocationCells(int[] loc){
        locationCells = loc;
    }

}
