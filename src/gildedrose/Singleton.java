package gildedrose;

/**
 * Created by darkabsolute on 4/11/15.
 */
public class Singleton extends ProductsAbstrac {

    Instances instances;

    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
        instances = new Instances();
    }

    @Override
    void lessQuality(Item item) {

        instances.getLess().diffAgienBackspace(item, instances);

        instances.getLess().sellInLessThatCero(item, instances);
    }

    @Override
    void mostQuality(Item item) {
        instances.getMost().diffAgienBackspace(item, instances);
    }

    @Override
    void sellIn(Item item) {
        instances.getSell().sellIn(item);
    }
}
