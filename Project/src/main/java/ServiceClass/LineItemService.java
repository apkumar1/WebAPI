package ServiceClass;

import DomainClass.AllData;
import DomainClass.LineItem;

public class LineItemService {
	
	//this is an example service class for the class LineItem
	//this class will be used to create a way to access data from anywhere in this case the AllData class which contains data

AllData alldata = new AllData();
	
	public LineItem getByID(Integer id) {
		return alldata.getLineItemByID(id);
	}
}
