package DomainClass;

public class Order {

	// this class defines an order that a shop processes
	// this is defined by its name, id, shop name, the line items that have been added to this order, and total cost of all items in this order

	// variables, constructors and getters are used to initialize and help set data for example
	private String name;
	private LineItem[] lineitems;
	private Integer id;
	private Shop shop;
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

	public Shop getShop() {
		return shop;
	}

	public Integer getOrderID() {
		return id;
	}

	public String getOrder() {
		return name;
	}

	public LineItem[] getLineItems() {
		return lineitems;
	}

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
