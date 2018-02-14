package SeaGame;

import java.util.ArrayList;

/**
 * Created by Natali on 30.01.2018.
 */
public class DotCom {

    private ArrayList<String> locationCells; // массив для хранения адреса ячеек
    //private int numOfHits = 0; // к-тво попаданий

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

   public String checkYourself(String userInput) {
        String result = "Мимо";

        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }
        return result;
    }



}
