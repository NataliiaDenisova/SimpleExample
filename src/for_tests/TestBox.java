package for_tests;

/**
 * Created by Natali on 25.02.2018.
 */

//p. 314
public class TestBox {
    Integer i = new Integer(5);
    int j = 2;

    public static void main(String[] args){
        //TestBox t = new TestBox();
        //t.go();
        int random = (int)(Math.random()*5);
        System.out.println(random);
    }

    public void go(){
        System.out.println("j до изменений: " + j);
        j = i;
        System.out.println(j);
        System.out.println(i);
    }
}

/*        Integer i = new Integer(42);
        i++;
        System.out.println("Our FIRST number : " + i.toString());

        Integer j = new Integer(5);
        Integer k = j + 3;
        System.out.println("Our SECOND number : " + k.toString());*/