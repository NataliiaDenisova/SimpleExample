package SeaGame;

/**
 * Created by Natali on 30.01.2018.
 */
public class SimpleDotComGame {
    public static void main (String[] args){
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper(); //класс с методом принимающим ввод пользователя
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int)(Math.random()*5); // from 0 to 4

        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCells(locations);

        boolean isAlive = true;

        while(isAlive == true){
            String guess = helper.getUserInput("Enter the number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;

            if(result.equals("Potopil")){
                isAlive = false;
                System.out.println("You needed " + numOfGuesses + " attempts");
            }
        }


    }
}
