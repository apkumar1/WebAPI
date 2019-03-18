package GraphQL;

import org.springframework.context.annotation.Configuration;

import io.leangen.graphql.ExtensionProvider;
import io.leangen.graphql.GeneratorConfiguration;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.metadata.strategy.query.BeanResolverBuilder;
import io.leangen.graphql.metadata.strategy.query.PublicResolverBuilder;
import io.leangen.graphql.metadata.strategy.query.ResolverBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.Arrays;

import ServiceClass.LineItemService;
import ServiceClass.OrderService;
import ServiceClass.ProductService;
import ServiceClass.ShopService;

import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import io.leangen.graphql.GraphQLSchemaGenerator;
import io.leangen.graphql.metadata.strategy.query.PublicResolverBuilder;

public class GraphQLMain {

	public static void main(String[] args) {
		
		LineItemService itemService = new LineItemService();
		OrderService orderService = new OrderService();
		ProductService prodService = new ProductService();
		ShopService shopService = new ShopService();
		
		GraphQLSchema schema = new GraphQLSchemaGenerator()
		    .withOperationsFromSingletons(itemService, orderService, prodService, shopService)
		    .generate(); 
		
		
		File file = new File ("C:/Users/apkum/OneDrive/Documents/Ecli/output.txt");
	    PrintWriter output;
		try {
			output = new PrintWriter ("output.txt");
			output.println (schema);
		    output.close ();  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	         
		
		/*GraphQL graphQL = new GraphQL.Builder(schema)
			.build();

		String query = "{ getOrderByID (id: 11) {name}}";
		
		ExecutionResult result = graphQL.execute(query);	*/
		
		
	}
}
