package SeaGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Natali on 30.01.2018.
 */
public class GameHelper {

    public String getUserInput(String prompt){

        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch(IOException e) {
            System.out.println("IOException: " + e);
        }

        return inputLine;
    }

}
