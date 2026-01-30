
public class OrderLogic {
	public Order createOrder(String product) {
		return new Order("ID-" + System.currentTimeMillis(), product);
	}
}
