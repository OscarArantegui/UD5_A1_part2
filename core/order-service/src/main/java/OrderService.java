
public class OrderService {
	private OrderLogic logic = new OrderLogic();

    public void processOrder(String productName) {
        Order newOrder = logic.createOrder(productName);
        System.out.println("Pedido creado correctamente.");
        OrderPrinter.printDetails(newOrder);
    }
}
