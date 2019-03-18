package DomainClass;

import io.leangen.graphql.annotations.GraphQLQuery;

public class LineItem {

	
	// this class defines a line item
	// a line item is identified by its name, id, quantity, price based on quantity, its product, and the order it is attached to

	// variables, constructors and getters to initialize and help set data for example

	@GraphQLQuery(name="quantity")
	private Integer quantity;
	
	@GraphQLQuery(name="price")
	private Double price;
	
	@GraphQLQuery(name="name")
	private String name;
	
	@GraphQLQuery(name="id")
	private Integer id;
	
	@GraphQLQuery(name="product")
	private Product product;
	
	@GraphQLQuery(name="order")
	private Order order;

	public LineItem(String name, Integer id, Order order, Product product, Double price, Integer quantity) {
		this.name = name;
		this.id = id;
		this.order = order;
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}

	@GraphQLQuery(name="order")
	public Order getOrder() {
		return order;
	}

	@GraphQLQuery(name="id")
	public Integer getLineItemID() {
		return id;
	}

	@GraphQLQuery(name="quantity")
	public Integer getQuantity() {
		return quantity;
	}

	@GraphQLQuery(name="price")
	public Double getPrice() {
		return price;
	}

	@GraphQLQuery(name="name")
	public String getLineItem() {
		return name;
	}

	@GraphQLQuery(name="product")
	public Product getProduct() {
		return product;
	}

	public String toString() {
		return (name + " " + quantity.toString() + " " + price.toString() + " ");
	}
}
