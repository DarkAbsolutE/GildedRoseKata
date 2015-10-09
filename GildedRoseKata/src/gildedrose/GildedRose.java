package gildedrose;

import java.util.List;

public class GildedRose {
	
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
