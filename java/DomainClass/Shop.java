package DomainClass;

import io.leangen.graphql.annotations.GraphQLQuery;

public class Shop {

	// this class defines a shop which contains many products and processes many orders daily
	// this is identified by its name, id, all the orders it processes, and all the products it contains

	// variables, constructors and getters are used to initialize and help set data for example
	
	@GraphQLQuery(name="name")
	private String name;
	
	@GraphQLQuery(name="orders")
	private Order[] orders;
	
	@GraphQLQuery(name="products")
	private Product[] products;
	
	@GraphQLQuery(name="id")
	private Integer id;

	public Shop(String name, Integer id, Order[] orders, Product[] products) {
		this.name = name;
		this.id = id;
		this.orders = orders;
		this.products = products;
	}

	@GraphQLQuery(name="id")
	public Integer getShopID() {
		return id;
	}

	@GraphQLQuery(name="name")
	public String getShop() {
		return name;
	}

	@GraphQLQuery(name="orders")
	public Order[] getAllOrders() {
		return orders;
	}

	@GraphQLQuery(name="products")
	public Product[] getAllProducts() {
		return products;
	}

}
