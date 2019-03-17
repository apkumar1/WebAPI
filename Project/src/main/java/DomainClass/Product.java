package DomainClass;

public class Product {
	
	//this class defines a product that is in a shop
	//this is identified by its name, id, price, shop it is located in, and line items that have used this product
	
	// variables, constructors and getters are used to initialize and help set data for example
	
	private String name;
	private LineItem[] lineitems;
	private Integer id;
	private Double price;
	private Shop shop;
	
	public Product(String name, Integer id, Shop shop, Double price, LineItem[] lineitems) {
		this.name = name;
		this.id = id;
		this.shop = shop;
		this.price = price;
		this.lineitems = lineitems;
	}
	
	public Shop getShop() {
		return shop;
	}
	
	public Integer getProductID() {
		return id;
	}
	
	public String getProduct() {
		return name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public LineItem[] getLineItems() {
		return lineitems;
	}
}
