package App.items.food;

import App.items.Item;

public class Cheese implements Item {
    private final String name;
    private final double price;
    public Cheese(String name, double price) {
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
