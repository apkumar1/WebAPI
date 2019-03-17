package ServiceClass;

import DomainClass.AllData;
import DomainClass.Product;

public class ProductService {
	
	//this is an example service class for the class Product
	//this class will be used to create a way to access data from anywhere in this case the AllData class which contains data
	
AllData alldata = new AllData();
	
	public Product getByID(Integer id) {
		return alldata.getProductByID(id);
	}
}
