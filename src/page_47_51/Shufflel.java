package page_47_51;

/**
 * Created by Natali on 14.02.2018.
 */
//page 47
public class Shufflel {
    public static void main(String[] args){
        int x = 3;

        while(x > 0){
            if(x > 2){
                System.out.print("a");
            }

            x = x -1;
            System.out.print("-");

            if(x == 2){
                System.out.print("b c");
            }

            if(x == 1){
                System.out.print("d");
                x = x - 1;
            }

        }


    }
}
