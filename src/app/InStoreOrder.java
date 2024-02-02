package app;

public class InStoreOrder implements Order {
    private final int quantity;
    private final double price;

    public InStoreOrder(String itemName, int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public double calculateTotalCost() {
        return quantity * price;
    }
}
