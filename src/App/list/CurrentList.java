package App.list;

import App.items.Item;

import java.util.ArrayList;
import java.util.List;

public class CurrentList {

    private List<Item> items;
    private boolean listExists;

    public CurrentList() {
        this.items = new ArrayList<>();
        this.listExists = false;
    }

    public void addItem(Item item) {
        items.add(item);
        listExists = true;
    }

    public void removeItem(Item item) {
        items.remove(item);
        if (items.isEmpty()) {
            listExists = false;
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public boolean isListExists() {
        return listExists;
    }



}
