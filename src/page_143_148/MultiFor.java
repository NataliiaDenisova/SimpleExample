package page_143_148;

/**
 * Created by Natali on 24.02.2018.
 */
// p. 144
public class MultiFor {
    public static void main(String[] args) {
        for (int x = 0; x < 4; x++) {
            if (x == 1) {
                x++;
            }
            for (int y = 4; y > 2; y--) {
                System.out.println(x + " " + y);

            }

        }

    }


}
