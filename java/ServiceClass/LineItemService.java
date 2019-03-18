package ServiceClass;

import org.springframework.stereotype.Service;

import DomainClass.AllData;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.annotations.GraphQLArgument;
import DomainClass.LineItem;
@Service
public class LineItemService {
	
	//this is an example service class for the class LineItem
	//this class will be used to create a way to access data from anywhere in this case the AllData class which contains data

AllData alldata = new AllData();
	
	@GraphQLQuery(name="getLineItemByID")
	public LineItem getByID(@GraphQLArgument(name="id") Integer id) {
		return alldata.getLineItemByID(id);
	}
}
