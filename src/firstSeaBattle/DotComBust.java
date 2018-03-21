package firstSeaBattle;

import java.util.ArrayList;

/**
 * Created by Natali on 21.03.2018.
 */
public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom dotFirst = new DotCom();
        dotFirst.setName("Pets.com");
        DotCom dotSecond = new DotCom();
        dotSecond.setName("eToys.com");
        DotCom dotThird = new DotCom();
        dotThird.setName("Go2.com");
        dotComsList.add(dotFirst);
        dotComsList.add(dotSecond);
        dotComsList.add(dotThird);

        System.out.println("Ваша цель - потопить три 'сайта'.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for(DotCom dotComToSet : dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    void checkUserGuess(String userGuess){
        String result = "Мимо";

        for(DotCom dotObj: dotComsList){
            dotObj.checkYourself(userGuess);
            if(dotComsList.indexOf(userGuess)){
                result = "Попал";
            }else{
                result = "Потопил";
                dotObj.remove(userGuess);
            }
        }
        return result;
    }

    void startPlaying() {
        while(!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Сделайте ход ");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    public void finishGame() {

    }

}
