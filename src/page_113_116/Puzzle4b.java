package page_113_116;

/**
 * Created by Natali on 23.02.2018.
 */
class Puzzle4b {
    int ivar;
    public int doStuff(int factor){
        if(ivar > 100){
            return ivar*factor;
        }else {
            return ivar*(5 - factor);
        }
    }
}
