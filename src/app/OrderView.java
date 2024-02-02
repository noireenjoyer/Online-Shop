package app;

public class OrderView {
    public void displayOrderDetails(Order order, double totalCost) {
        System.out.println("Order Details:");
        System.out.println("Item: " + order.getClass().getSimpleName());
        System.out.println("Total Cost: $" + totalCost);
    }
}
