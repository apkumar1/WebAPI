package ServiceClass;

import org.springframework.stereotype.Service;

import DomainClass.AllData;
import DomainClass.Order;
import DomainClass.Shop;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.annotations.GraphQLArgument;

@Service
public class OrderService {
	
	//this is an example service class for the class Order
	//this class will be used to create a way to access data from anywhere in this case the AllData class which contains data
	
	AllData alldata = new AllData();
	@GraphQLQuery(name="getOrderByID")
	public Order getByID(@GraphQLArgument(name="id") Integer id) {
		return alldata.getOrderByID(id);
	}
	
	//another example of a query that can be made
	@GraphQLQuery(name="getOrderByShopID")
	public Order[] getOrdersByShopID(@GraphQLArgument(name="id") Integer id) {
		Shop shop = alldata.getShopByID(id);
		return shop.getAllOrders();
		
	}
}
