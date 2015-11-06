package gildedrose;

/**
 * Created by darkabsolute on 4/11/15.
 */
public class LessQuality implements LessQualityInterface, MethosEqualsInterface {

    public void lessQuality(Item item) {
        if (!item.getName().equals("Sulfuras, Hand of Ragnaros") && item.getQuality() > 0) {
            if (item.getName().equals("Conjured Mana Cake")) {
                item.setQuality(item.getQuality() - 2);
            } else {
                item.setQuality(item.getQuality() - 1);
            }
        }
    }

    public void diffAgienBackspace(Item item, Instances instances) {
        if (!item.getName().equals("Aged Brie")
                && !item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
            instances.getLess().lessQuality(item);
        }
    }

    public void sellInLessThatCero (Item item, Instances instances) {
        if (item.getSellIn() < 0) {
            if (!item.getName().equals("Aged Brie")) {
                if (!item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                    instances.getLess().lessQuality(item);
                } else {
                    item.setQuality(item.getQuality() - item.getQuality());
                }
            } else {
                instances.getMost().qualityLessThat50(item);
            }
        }
    }
}
