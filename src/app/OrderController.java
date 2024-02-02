package app;

public class OrderController {
    private final OrderView orderView;

    public OrderController(OrderView orderView) {
        this.orderView = orderView;
    }

    public void processOrder(Order order) {
        double totalCost = order.calculateTotalCost();
        orderView.displayOrderDetails(order, totalCost);
    }
}
