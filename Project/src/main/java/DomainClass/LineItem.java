package DomainClass;

public class LineItem {

	// this class defines a line item
	// a line item is identified by its name, id, quantity, price based on quantity, its product, and the order it is attached to

	// variables, constructors and getters to initialize and help set data for example

	private Integer quantity;
	private Double price;
	private String name;
	private Integer id;
	private Product product;
	private Order order;

	public LineItem(String name, Integer id, Order order, Product product, Double price, Integer quantity) {
		this.name = name;
		this.id = id;
		this.order = order;
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}

	public Order getOrder() {
		return order;
	}

	public Integer getLineItemID() {
		return id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double getPrice() {
		return price;
	}

	public String getLineItem() {
		return name;
	}

	public Product getProduct() {
		return product;
	}

	public String toString() {
		return (name + " " + quantity.toString() + " " + price.toString() + " ");
	}
}
