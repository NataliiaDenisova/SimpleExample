package firstSeaBattle;

import java.util.ArrayList;

/**
 * Created by Natali on 05.03.2018.
 */
public class SimpleDotComGame {
    public static void main(String[] args){
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        DotCom theDotCom = new DotCom();
        int randomNum = (int)(Math.random()*5);
       // int[] locations = {randomNum, randomNum+1, randomNum+2};
        ArrayList<String> locations = new ArrayList<String>();
        locations.add(Integer.toString(randomNum));
        locations.add(Integer.toString(randomNum+1));
        locations.add(Integer.toString(randomNum+2));
        System.out.print("Местоположение нашего корабля: ");
        for(String cells: locations){
            System.out.print(cells + " ");
        }
        System.out.println(" ");

        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive == true){
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;

            if(result.equals("Потопил")){
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
            }
        }






    }
}
