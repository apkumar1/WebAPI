package DomainClass;

public class AllData {

	private Shop shop;

	private Product p1, p2, p3;
	private Product[] prods1 = { p1 };
	private Product[] prods2 = { p2, p3 };

	private Order o1, o2, o3;

	private LineItem l1, l2, l3, l4;
	private LineItem[] li1 = { l1, l4 };
	private LineItem[] li2 = { l2 };
	private LineItem[] li3 = { l3 };
	private LineItem[] li4 = { l1, l2, l3 };
	
	private Order[] orders1 = { o1, o2 };
	
	private Shop[] allshops = {shop};
	private LineItem[] allitems = {l1, l2, l3, l4};
	private Order[] allorders = {o1, o2, o3};
	private Product[] allprods = {p1, p2, p3};

	public void setAllData() {
		// EXAMPLE DATA SET 1

		// there is 1 shop named Grocery Shop
		shop = new Shop("Grocery Shop", 111, orders1, prods1);

		// This shop sells 3 products: milk, bread, eggs
		p1 = new Product("Milk", 01, shop, 5.50, li1);
		p2 = new Product("Bread", 02, shop, 2.50, li2);
		p3 = new Product("Eggs", 03, shop, 3.50, li3);

		// Each product corresponds to the line item in an order
		// Milk has 2: l1 and l2, this means two orders included milk
		l1 = new LineItem("Item: Milk", 001, o1, p1, 5.50, 1);
		l2 = new LineItem("Item: Bread", 002, o1, p2, 5.00, 2);
		l3 = new LineItem("Item: Eggs", 003, o1, p3, 7.00, 2);
		l4 = new LineItem("Item: Milk", 001, o1, p1, 11.00, 2);

		// Line item lists to make it easier to access data
		// li1, li2, li3 are for products: each product is related to the line item when
		// it is added to order
		// li1 = {l1, l4}; //this is milk on an order
		// li2 = {l2}; // this is bread on an order
		// li3 = {l3}; // this is eggs on an order

		// li4 is for order: multiple line items make up an order
		// not the same as products grouping because products group by the same type:
		// milk = li1 because it includes l1 and l4
		// LineItem[] li4 = {l1, l2, l3}; // this is an example order

		// The shop has gotten two orders
		o1 = new Order("Order One", 11, shop, li4); // contains all 3 products
		o2 = new Order("Order Two", 22, shop, li2); // contains only bread

		// Similarly other shops, orders, products, items can be added or created
	}
	
	public Order getOrderByID(Integer id) {
		setAllData();
		for (int i=0; i < allorders.length; i++) {
			if (allorders[i].getOrderID() == id) {
				return allorders[i];
			}
		}
		return null;
	}

	public LineItem getLineItemByID(Integer id) {
		setAllData();
		for (int i=0; i < allitems.length; i++) {
			if (allitems[i].getLineItemID() == id) {
				return allitems[i];
			}
		}
		return null;
	}
	
	public Shop getShopByID(Integer id) {
		setAllData();
		for (int i=0; i < allshops.length; i++) {
			if (allshops[i].getShopID() == id) {
				return allshops[i];
			}
		}
		return null;
	}
	
	public Product getProductByID(Integer id) {
		setAllData();
		for (int i=0; i < allprods.length; i++) {
			if (allprods[i].getProductID() == id) {
				return allprods[i];
			}
		}
		return null;
	}
	
	public Order[] getAllOrders() {
		return allorders;
	}
}
