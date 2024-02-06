package App.items.beverages;

import App.items.Item;

public class Beer implements Item {
    private final String name;
    private final double price;
    public Beer(String name, double price) {
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
