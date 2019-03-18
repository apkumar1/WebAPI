package ServiceClass;

import org.springframework.stereotype.Service;

import DomainClass.AllData;
import DomainClass.Product;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.annotations.GraphQLArgument;

@Service
public class ProductService {
	
	//this is an example service class for the class Product
	//this class will be used to create a way to access data from anywhere in this case the AllData class which contains data
	
AllData alldata = new AllData();

	@GraphQLQuery(name="getProductByID")
	public Product getByID(@GraphQLArgument(name="id") Integer id) {
		return alldata.getProductByID(id);
	}
}
