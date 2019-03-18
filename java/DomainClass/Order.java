package DomainClass;

import io.leangen.graphql.annotations.GraphQLQuery;

public class Order {

	// this class defines an order that a shop processes
	// this is defined by its name, id, shop name, the line items that have been added to this order, and total cost of all items in this order

	// variables, constructors and getters are used to initialize and help set data for example
	
	@GraphQLQuery(name="name")
	private String name;
	
	@GraphQLQuery(name="lineitems")
	private LineItem[] lineitems;
	
	@GraphQLQuery(name="id")
	private Integer id;
	
	@GraphQLQuery(name="shop")
	private Shop shop;
	
	@GraphQLQuery(name="bill")
	private Double bill;

	public Order(String name, Integer id, Shop shop, LineItem[] lineitems) {
		this.name = name;
		this.id = id;
		this.shop = shop;
		this.lineitems = lineitems;
		for (int i = 0; i < lineitems.length; i++) {
			this.bill = this.bill + lineitems[i].getPrice();
		}
	}
	
	@GraphQLQuery(name="shop")
	public Shop getShop() {
		return shop;
	}

	@GraphQLQuery(name="id")
	public Integer getOrderID() {
		return id;
	}

	@GraphQLQuery(name="name")
	public String getOrder() {
		return name;
	}

	@GraphQLQuery(name="lineitems")
	public LineItem[] getLineItems() {
		return lineitems;
	}

	@GraphQLQuery(name="bill")
	public Double getTotalcost() {
		return bill;
	}

	public String toString() {
		String lines = "";
		for (int i = 0; i < lineitems.length; i++) {
			lines = lines + lineitems[i].toString() + " ";
		}
		return name + "Items: " + lines + "Total Price" + bill.toString();
	}
}
