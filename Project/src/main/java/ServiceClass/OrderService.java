package ServiceClass;

import DomainClass.AllData;
import DomainClass.Order;
import DomainClass.Shop;

public class OrderService {
	
	//this is an example service class for the class Order
	//this class will be used to create a way to access data from anywhere in this case the AllData class which contains data
	
	AllData alldata = new AllData();
	
	public Order getByID(Integer id) {
		return alldata.getOrderByID(id);
	}
	
	//another example of a query that can be made
	public Order[] getOrdersByShop(Integer id) {
		Shop shop = alldata.getShopByID(id);
		return shop.getAllOrders();
		
	}
}
