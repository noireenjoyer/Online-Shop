package app;

public class Main {
    public static void main(String[] args) {
        Order inStoreOrder = new InStoreOrder("Laptop", 2, 800.0);
        Order deliveryOrder = new DeliveryOrder("Smartphone", 1, 500.0, 5.0);

        OrderView orderView = new OrderView();
        OrderController orderController = new OrderController(orderView);

        orderController.processOrder(inStoreOrder);
        orderController.processOrder(deliveryOrder);
    }
}