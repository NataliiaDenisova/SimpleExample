package firstSeaBattle;

import java.util.ArrayList;

/**
 * Created by Natali on 05.03.2018.
 */

public class DotCom {
    private ArrayList<String> locationCells;
    private String dotName;
    //private int numOfHits;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Потопил";
                System.out.println("Ой! Вы потопили " + dotName + ".");
            } else {
                result = "Попал";
            }
        }
        return result;
    }

    public void setName(String name){
        dotName = name;
    }
//    int[] locationCells;
//    int numOfHits = 0;
//
//    public String checkYourself(String userGuess) {
//        int guess = Integer.parseInt(userGuess);
//        String result = "Мимо";
//
//        for (int cell : locationCells) {
//            if (guess == cell) {
//                result = "Попал";
//                numOfHits++;
//                break; // выбираемся из цикла: другие ячейки проверять не нужно
//            }
//        }
//
//        if (numOfHits == locationCells.length) {
//            result = "Потопил";
//        }
//        System.out.println(result); //выводим мимо, если результат не был изменен
//
//        return result; // возвращаем результат в вызывающий метод
//    }
//
//    public void setLocationCells(int[] locs){
//        locationCells = locs;
//    }
//
}

/*
* public String checkYourself(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        String result = "Мимо";

        for (int cell : locationCells) {
            if (guess == cell) {
                locationCells[guess] = 0;
                if(guess==locationCells.length()){
                    if(numOfHits==3){
                        result = "Потопил";
                    }else{
                        result = "Попал";
                    }
                       }
        return result; // возвращаем результат в вызывающий метод
    }
*
*
* */




