package page281;

/**
 * Created by Natali on 26.02.2018.
 */
public class SonOfBoo extends Boo{
    public SonOfBoo(){
        super("boo");
        System.out.println("Первый конструктор SonOfBoo");
    }

    public SonOfBoo(int i){
        super("fred");
        System.out.println("Второй конструктор SonOfBoo");
    }

    public SonOfBoo(String s){
        super(42);
        System.out.println("Третий конструктор SonOfBoo");
    }

/*    public SonOfBoo(int i, String s){
        doesn't work
    }*/

/*    public SonOfBoo(String a, String b, String c){
        super(a, b);
        doesn't work
    }*/

    public SonOfBoo(int i, int j){
        super("man", j);
        System.out.println("Четвертый конструктор SonOfBoo");
    }

/*    public SonOfBoo(int i, int x, int y){
        super(i, "star");
        doesn't work
    }*/
}
