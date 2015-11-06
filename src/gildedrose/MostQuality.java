package gildedrose;

/**
 * Created by darkabsolute on 4/11/15.
 */
public class MostQuality implements MostQualityInterface, MethosEqualsInterface {

    public void mostQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);

            lessTo(item, 11);
            lessTo(item, 6);
        }
    }

    public void lessTo(Item item, int x) {
        if (item.getSellIn() < x && item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
            item.setQuality(item.getQuality() + 1);
        }
    }

    public void qualityLessThat50(Item item) {
        if (item.getQuality() < 50 && item.getSellIn() < 0 && item.getName().equals("Aged Brie")) {
            item.setQuality(item.getQuality() + 1);
        }
    }

    public void diffAgienBackspace(Item item, Instances instances) {
        if (item.getName().equals("Aged Brie")
                || item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
            instances.getMost().mostQuality(item);
        }
    }
}
