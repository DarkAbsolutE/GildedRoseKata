package gildedrose;

/**
 * Created by darkabsolute on 4/11/15.
 */
public class Singleton {
    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {

    }
}
