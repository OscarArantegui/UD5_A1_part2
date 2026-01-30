public class Order {
	private String id;
	private String product;
	
	public Order(String id, String product) {
		this.id=id;
		this.product=product;
	}
	@Override
	public String toString() { return "Order [id= "+id+", product= "+product+"]";}
}
