package ServiceClass;

import DomainClass.AllData;
import DomainClass.Shop;

public class ShopService {
	
	//this is an example service class for the class Shop
	//this class will be used to create a way to access data from anywhere in this case the AllData class which contains data

AllData alldata = new AllData();
	
	public Shop getShopByID(Integer id) {
		return alldata.getShopByID(id);
	}
}
