package App.items.vegetables;

import App.items.Item;

public class Paprika implements Item {
    private final String name;
    private final double price;
    public Paprika(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
