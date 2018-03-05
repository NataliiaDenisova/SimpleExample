package firstSeaBattle;

/**
 * Created by Natali on 05.03.2018.
 */

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public String checkYourself(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        String result = "Мимо";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break; // выбираемся из цикла: другие ячейки проверять не нужно
            }
        }

        if (numOfHits == locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result); //выводим мимо, если результат не был изменен

        return result; // возвращаем результат в вызывающий метод
    }

    public void setLocationCells(int[] locs){
        locationCells = locs;
    }

}
