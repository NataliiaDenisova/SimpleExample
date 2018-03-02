package page_256;

/**
 * Created by Natali on 02.03.2018.
 */
interface Nose {
    public int iMethod();
}

abstract class Picasso implements Nose {
    @Override
    public int iMethod() {
        return 7;
    }
}

class Clowns extends Picasso {
}

class Acts implements Nose {
    @Override
    public int iMethod() {
        return 5;
    }
}
