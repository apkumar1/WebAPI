package DomainClass;

public class Shop {

	// this class defines a shop which contains many products and processes many orders daily
	// this is identified by its name, id, all the orders it processes, and all the products it contains

	// variables, constructors and getters are used to initialize and help set data for example
	private String name;
	private Order[] orders;
	private Product[] products;
	private Integer id;

	public Shop(String name, Integer id, Order[] orders, Product[] products) {
		this.name = name;
		this.id = id;
		this.orders = orders;
		this.products = products;
	}

	public Integer getShopID() {
		return id;
	}

	public String getShop() {
		return name;
	}

	public Order[] getAllOrders() {
		return orders;
	}

	public Product[] getAllProducts() {
		return products;
	}

}
