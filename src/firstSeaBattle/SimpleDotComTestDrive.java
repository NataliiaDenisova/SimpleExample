package firstSeaBattle;

import java.util.ArrayList;

/**
 * Created by Natali on 05.03.2018.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args){
        DotCom dot = new DotCom();
        ArrayList<String > locations = new ArrayList<String>();
        locations.add("2");
        locations.add("3");
        locations.add("4");
        //int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);

        String userGuess = "6";
        String result = dot.checkYourself(userGuess);
        String testResult = "Неудача";

        if(result.equals("Попал")){
            testResult = "Пройден";
        }
        System.out.println(testResult);
    }
}
