package gildedrose;

/**
 * Created by darkabsolute on 4/11/15.
 */
public class LessQuality extends MethodsGil {
    public void qualityLessThat50(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }

    public void lessQuality(Item item) {
        if (item.getQuality() > 0) {
            if (item.getName() != "Sulfuras, Hand of Ragnaros") {
                if (item.getName() == "Conjured Mana Cake") {
                    item.setQuality(item.getQuality() - 2);
                } else {
                    item.setQuality(item.getQuality() - 1);
                }
            }
        }
    }

    public void lessTo(Item item, int x) {
        if (item.getSellIn() < x) {
            qualityLessThat50(item);
        }
    }
}
