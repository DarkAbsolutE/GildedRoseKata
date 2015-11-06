package gildedrose;

/**
 * Created by darkabsolute on 4/11/15.
 */
public class Singleton extends ProductsAbstrac {

    LessQuality less = new LessQuality();
    MostQuality most = new MostQuality();
    SellIn sell = new SellIn();

    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {

    }

    @Override
    void lessQuality(Item item) {

        if (!item.getName().equals("Aged Brie")
                && !item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
            less.lessQuality(item);
        }

        if (item.getSellIn() < 0) {
            if (!item.getName().equals("Aged Brie")) {
                if (!item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                    less.lessQuality(item);
                } else {
                    item.setQuality(item.getQuality() - item.getQuality());
                }
            } else {
                most.qualityLessThat50(item);
            }
        }
    }

    @Override
    void mostQuality(Item item) {
        if (item.getName().equals("Aged Brie")
                || item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
            most.mostQuality(item);
        }
    }

    @Override
    void sellIn(Item item) {
        sell.sellIn(item);
    }
}
