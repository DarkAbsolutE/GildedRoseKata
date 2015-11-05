package gildedrose;

import java.util.List;
/**
 * Created by darkabsolute on 4/11/15.
 */
public class GildedRose extends LessQuality {

    public void updateQuality(List<Item> items) {
        for (Item item : items) {

            if (!item.getName().equals("Aged Brie")
                    && !item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                lessQuality(item);
            } else {
                if (item.getQuality() < 50) {
                    item.setQuality(item.getQuality() + 1);

                    if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                        lessTo(item, 11);
                        lessTo(item, 6);
                    }
                }
            }

            if (item.getName() != "Sulfuras, Hand of Ragnaros") {
                item.setSellIn(item.getSellIn() - 1);
            }

            if (item.getSellIn() < 0) {
                if (item.getName() != "Aged Brie") {
                    if (item.getName() != "Backstage passes to a TAFKAL80ETC concert") {
                        lessQuality(item);
                    } else {
                        item.setQuality(item.getQuality() - item.getQuality());
                    }
                } else {
                    qualityLessThat50(item);
                }
            }
        }
    }
}
