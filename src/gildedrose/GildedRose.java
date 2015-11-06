package gildedrose;

import java.util.List;
/**
 * Created by darkabsolute on 4/11/15.
 */
public class GildedRose extends LessQuality {

    public void updateQuality(List<Item> items) {
        Singleton singleton = Singleton.getInstance();

        for (Item item : items) {
            singleton.mostQuality(item);

            singleton.sellIn(item);

            singleton.lessQuality(item);
        }
    }
}
