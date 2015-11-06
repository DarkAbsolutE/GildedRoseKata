package gildedrose;

/**
 * Created by darkabsolute on 4/11/15.
 */
public class LessQuality {

    public void lessQuality(Item item) {
        if (!item.getName().equals("Sulfuras, Hand of Ragnaros") && item.getQuality() > 0) {
            if (item.getName().equals("Conjured Mana Cake")) {
                item.setQuality(item.getQuality() - 2);
            } else {
                item.setQuality(item.getQuality() - 1);
            }
        }
    }
}
