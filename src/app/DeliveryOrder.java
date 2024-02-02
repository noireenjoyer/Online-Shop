package app;

public class DeliveryOrder implements Order {
    public String itemName;
    private final int quantity;
    private final double price;
    private final double deliveryCostPercentage;

    public DeliveryOrder(String itemName, int quantity, double price, double deliveryCostPercentage) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.deliveryCostPercentage = deliveryCostPercentage;
    }

    @Override
    public double calculateTotalCost() {
        double subtotal = quantity * price;
        double deliveryCost = subtotal * (deliveryCostPercentage / 100);
        return subtotal + deliveryCost;
    }
}
