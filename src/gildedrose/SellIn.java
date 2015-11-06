package gildedrose;

/**
 * Created by darkabsolute on 6/11/15.
 */
public class SellIn {

    public void sellIn(Item item) {
        if (item.getName() != "Sulfuras, Hand of Ragnaros") {
            item.setSellIn(item.getSellIn() - 1);
        }
    }
}
