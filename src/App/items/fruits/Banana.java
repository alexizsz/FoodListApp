package App.items.fruits;

import App.items.Item;

public class Banana implements Item {
    private final String name;
    private final double price;
    public Banana(String name, double price) {
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
