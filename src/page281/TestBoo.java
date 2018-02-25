package page281;

/**
 * Created by Natali on 26.02.2018.
 */
public class TestBoo {
    public static void main(String[] args){
        SonOfBoo firstSon = new SonOfBoo();
        SonOfBoo secondSon = new SonOfBoo(5);
        SonOfBoo thirdSon = new SonOfBoo("Third son of Boo");
        SonOfBoo fourthSon = new SonOfBoo(7, 11);

        Boo firstBoo = new Boo(8);
        Boo secondBoo = new Boo("Second Boo");
        Boo thirdBoo = new Boo("Thord Boo", 3);

        System.out.println("My output: " + firstBoo);
    }
}
