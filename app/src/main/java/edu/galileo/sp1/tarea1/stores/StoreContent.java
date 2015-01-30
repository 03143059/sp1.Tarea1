package edu.galileo.sp1.tarea1.stores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class StoreContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<StoreItem> STORES = new ArrayList<StoreItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, StoreItem> ITEM_MAP = new HashMap<String, StoreItem>();

    static {
        // Add 3 sample items.
        addItem(new StoreItem("1", "Store 1", "Subtitle 1"));
        addItem(new StoreItem("2", "Store 2", "Subtitle 2"));
        addItem(new StoreItem("3", "Store 3", "Subtitle 3"));
    }

    private static void addItem(StoreItem item) {
        STORES.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class StoreItem {
        public String id;
        public String title;
        public String subtitle;

        public StoreItem(String id, String title, String subtitle) {
            this.id = id;
            this.title = title;
            this.subtitle = subtitle;
        }

        @Override
        public String toString() {
            return String.format("%s\n%s", title, subtitle);
        }

        public String getTitle() {
            return title;
        }

        public String getSubtitle() {
            return subtitle;
        }
    }
}
