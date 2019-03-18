# WebAPI
Server Side Web API

Components before Deployment
-Package: DomainClass
-Package: ServiceClass
-Package: GraphQL
-build.gradle

I have used GraphQL for this challenge. 

The domain class includes the classes needed: Order, Shop, LineItem, Product
The service class includes the services needed for query: getOrderByID etc. for OrderService, ShopService, LineItemService, ProductService
The graphQL class includes the graphql implementation using graphql-spqr library

The library is installed and used through gradle compile in build.gradle

In the domain/service class: GraphQLQuery annotation symbolizes where a query can be used and GraphQLArgument if there is a parameter needed for a query

In the graphql class: both annotations are used to create a schema using GraphQLSchema, then using that to make GraphQL object that can be used to create an ExecutionResult object that executes any query.

How to use graphql:
1. a schema is created using the services classes and GraphQLSchemaGenerator 
2. can be output to a text file to be seen as shown in GraphQLMain class
3. converted to GraphQL object (uncomment lines)
4. execute a string query into a ExecutionResult object (uncomment lines)
5. the variable result of ExecutionResult shows data, errors etc. data will show the result of query in GraphQL format
6. Example {getOrderByID(id:11){name, id}} will show {data{getOrderByID{name: "Order One", id: 11}}}

(Requires use of external GraphQL ide to view the result such as GraphQL Playground)

Deployment-Attempting Kubernetes
Using: https://cloud.google.com/kubernetes-engine/docs/tutorials/hello-app

export PROJECT_ID="$(gcloud config get-value project -q)"
docker build -t gcr.io/${webapi-234907}/java:v1 .
gcloud auth configure-docker
docker push gcr.io/${webapi-234907}/java:v1
docker run --rm -p 8080:8080 gcr.io/${webapi-234907}/java:v1
curl http://localhost:8080

faced issues of file locations & installing docker
