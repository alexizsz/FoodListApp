package App.items;

import java.util.ArrayList;
import java.util.List;

public interface Item {
    String getName();
    double getPrice();

    static List<Item> getAllItems(List<? extends Item> itemList) {
        List<Item> allItems = new ArrayList<>();
        allItems.addAll(itemList);
        return allItems;
    }
}
