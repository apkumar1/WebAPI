package DomainClass;

import io.leangen.graphql.annotations.GraphQLQuery;

public class Product {
	
	//this class defines a product that is in a shop
	//this is identified by its name, id, price, shop it is located in, and line items that have used this product
	
	// variables, constructors and getters are used to initialize and help set data for example
	
	@GraphQLQuery(name="name")
	private String name;
	
	@GraphQLQuery(name="lineitems")
	private LineItem[] lineitems;
	
	@GraphQLQuery(name="id")
	private Integer id;
	
	@GraphQLQuery(name="price")
	private Double price;
	
	@GraphQLQuery(name="shop")
	private Shop shop;
	
	public Product(String name, Integer id, Shop shop, Double price, LineItem[] lineitems) {
		this.name = name;
		this.id = id;
		this.shop = shop;
		this.price = price;
		this.lineitems = lineitems;
	}
	
	@GraphQLQuery(name="shop")
	public Shop getShop() {
		return shop;
	}

	@GraphQLQuery(name="id")
	public Integer getProductID() {
		return id;
	}
	
	@GraphQLQuery(name="name")
	public String getProduct() {
		return name;
	}
	
	@GraphQLQuery(name="price")
	public Double getPrice() {
		return price;
	}
	
	@GraphQLQuery(name="lineitems")
	public LineItem[] getLineItems() {
		return lineitems;
	}
}
