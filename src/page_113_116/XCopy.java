package page_113_116;

/**
 * Created by Natali on 16.02.2018.
 */
//p. 113
public class XCopy {
    public static void main(String[] args){

        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);

        System.out.println(orig + " " + y);

    }

    int go(int arg){
        arg = arg*2;
        return arg;
    }
}
