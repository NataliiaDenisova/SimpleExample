package page_266_268;

/**
 * Created by Natali on 26.02.2018.
 */
//p. 266
public class Duck {
    int size;

    public Duck(int duckSize) {
        System.out.println("Кря");
        size = duckSize;
        System.out.println("Размер равен: " + size);
    }

    public void setSize(int newSize) {
        size = newSize;
    }

    public int getSize() {
        return this.size;
    }
}
