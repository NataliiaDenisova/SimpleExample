package firstSeaBattle;

import java.util.ArrayList;

/**
 * Created by Natali on 21.03.2018.
 */
public class DotComBust {
    public  static void main(String[] args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

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

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Мимо";

        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Попал")) {
                break;
            }
            if (result.equals("Потопил")){
                dotComsList.remove(dotComToTest);
            }
        }
        System.out.println(result);
    }

    void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделайте ход ");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    public void finishGame() {
        System.out.println("Все 'сайты' ушли ко дну! Ваши акции теперь ничего не стоят.");
        if(numOfGuesses <= 18){
            System.out.println("Это заняло у вас всего " + numOfGuesses + " попыток.");
            System.out.println("Вы успели выбраться до того, как ваши вложения утонули.");
        } else {
            System.out.println("Это заняло у вас довольно много времени. " + numOfGuesses + " попыток.");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений.");
        }
    }


}
