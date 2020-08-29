# Java, Spring Boot and JPA

-------

Banuprakash C
Co-founder Lucida Technologies Pvt Ltd.,

Full Stack Architect

banu@lucidatechnologies.com

banuprakashc@yahoo.co.in

https://www.linkedin.com/in/banu-prakash-50416019/

---------------------------------------------------
	
	1) OOP
	2) Programming to interface
	3) Java Collection Framework
		List, Set and Map
	4) Understanding Functional Interface and using Lambda
	5) Exception handling
	6) JDBC --> MySQL
	7) Java Concurrency programming *
	8) Reflection API and Annotations *
	9) Introduction to Spring
	10) Unit Testing
==========================================================================================



	Reflection API:--> Runtime Type Identification

	==> Given an Object I should be able to invoke its methods
	==> I should be able to create an object of class, event if I don't know the class name in advance


	instanceof vs getClass()


	Product p = new Tv();

	p instanceof Tv ===> true
	p instanceof Product ===> true
	p instanceof Object ==> true
	p instanceof Mobile ==> false


	p.getClass() == Tv.class ===> true
	p.getClass() == Product.class ==> false
	p.getClass() == Object.class ===> false

	========================================

	SOLID design Principle
		S ==> Single Responsibility
		O ==> Open Close Principle
		L ==> Liskov Substitution Principle
		D ==> Dependency Injection

	===============

		DAO class ==> CRUD operations
		UI ==> User interface
		entity ==> Business data


	==

	OCP ==>
	Component / Object should be closed for Change but open for extension


		Invoking methods:

		If we know the method name in advance:
		context.method(); ==> object.method(); or class.method()

		context becomes "this" pointer
		==========

		method.invoke(context);

		================

		To switch between various strategies, Where is the code getting changed?
		MySQL to MongoDB to Redis ==> Client

		Why code should not be changed in client?
		1) Abstraction is lost ==> Why should client know about implementention
		2) Client are many and hetergenous [ Mobile, web , Stand alone client ,...]

		==================

		How do you create Objects?

		1) "new" keyword
			if we know the class name

			new ClassName();

		2) If we don't know the class name in advance?

			I will read the KEY [PRD_DAO] from properties file
				==> com.adobe.prj.dao.ProductDaoMySQLImpl

			String str = ....

			Class.forName(str); //loads the class into JVM

			Class.forName(str).newInstance(); // create object of class which is loaded ==> info from properties file



			Class.forName("java.lang.String").newInstance(); // String object

			Class.forName("com.adobe.prj.entity.Product").newInstance() ; // Product object


			i18N ==> Internationalozation
			messages.properties

			GREET=Welcome 

================================================================

	Annotation
	==========
		Meta data ==> data about data

		1) Who uses it?
			a) Compiler
			b) CLASSLOADER
			c) RUNTIME
		2) Where can I use it?
			a) TYPE
			b) Constructor
			c) METHOD
			d) FILEDS

		===========

			@Override is used by Compiler

			Compiler checks if the method signature matches in base class and checks if it needs to compile or not


			class A {
					void test() {

					}
			}

			class B extends A {
					@Override
					public void test() {

					}
			}

			================

			@Test ==> JUnit

			used by Runtime

			Unit testing framework At Runtime methods which are marked as @Test is detected and invoked

			=========

			@Controller, @RequestMapping
============================================================================================

	@Table(name="products")
	public class Product{

		@Column(name="PRD_ID", type="NUMERIC(12"))
		getId() 	


		@Column(name="PRD_NAME" )
		getName()
	}

	@Table(name="emp")
	public class Employee {
		...
	}	


	using this metadata we generate SQL [ DDL and DML]

	==============================================================

	List<String> strList = new ArrayList<>();

	List<Product> prdList = new ArrayList<>();

	List<Object> objList = strList; // error

	// ? == unkonw type can point to any type

	List<?> list = strList;
	List<?> list - prdList;

	=========================================

	Maven
		==> Dependecy Management Tool
		==> In java depdenency libraries are available in the form of "jar" files

		=======================

		pom.xml ==> Project object model
			==> contains details about dependecies

			<dependencies>
				<dependency>
    				<groupId>mysql</groupId>
    				<artifactId>mysql-connector-java</artifactId>
    				<version>5.1.45</version>
				</dependency>

				<dependency<
					<groupId>org.junit<./
					..
					..
			</dependecnies>


		Transitive dependencies
			A1.2.jar ==> B 4.5.jar ==> c7.8.jar
======================================================================================

	
	Eclipse Market Place 
		==> STS ==> Search "go"
		==> Spring Tools (4) ==> install

=======================================================================================

	
	Spring Boot and JPA
	-------------------

	Online ordering RESTful web application
	---------------------------------------

	Spring Framework:
		lightweight container for building enterprise applications.
		Spring at the core provides Dependency Injection

	Dependency?	


		DAO class:

			Connection con = DriverManager.getConnection(URL, USER, PWD);
		

		Tea Break ==> I go in search of Tea

		------------

		Day 1 : Abha / Tejaswini / Ravinder [ Course Co-oridator]
			Ask my requirement
			onetime on day 1 I give them the requiremnets
			Then they in turn assign a office boy to deliver Tea to me
			10:45 and 3:30 I get Tea

		----------------------

			Maven / Gradle/ Ivy / Builder ==> Dependency management Tool


			groupId ==> Project
			artificatId ==> Module [ Adminst / Customer module / payment module ]
			version



		=================================================

			Eclipse for Enterprise developers 2020
			https://www.eclipse.org/downloads/packages/release/2020-06/r/eclipse-ide-enterprise-java-developers

			eclipse ==> Market Place ==> STS ==> go ==> install

			---

			New Spring Starter Project:
				Name: firstapp

				group: com.adobe
				artifact: firstapp

				package: com.adobe

			Create project

			Right click on project ==> Maven ==> update project ==> Force update
			once all jars are downloaded, project should have maven dependencies ==> no errors in projects

		========================================================

			Spring creates objects of class which has one of these annotations 
				1) Repository
				2) Service
				3) Controller
				4) RestController
				5) Configuration
				6) Compononent


			=====

			@SpringBootApplication does the following:
				1) @ComponentScan
					==> scans all packages which are under "com.adobe"
					search for above mentioned annotations and creates objects....

				2) @EnableAutoConfiguration
					==> scans for class in "jar" files and see if it's autodiscoverable and create
					instance of it.


			======
			SpringApplication.run(FirstappApplication.class, args);

			creates Spring container

			2 ways to resolve if for a givern interface more than 1 implmentations:

			1) use @Primary on class 
			2) use @Qualifer("nameOfBean") along with @Autowired

			===============================================

			MySQL
			===========================================

				1) mysql
				2) web ==> spring web
				3) jpa ==> spring data jpa

			==========================================================


		ORM and JPA

		Object Relational mapping

		ORM frameworks:
			1) Hibernate [ Spring boot data jpa by default use]
			2) openJPA
			3) KODO
			4) TopLink

		These fraameworks will generate CRUD operations for you based on metadata [ Annotation]


		ORM frameworks looks for classes which has @Entity annotation and manage

		POSTMAN

		=================================================================================
		

	 	ORM ==> Object Relational Mapping

	 	Java Class <-----------> Relational database table
	 	fields <-------------> columns of table

	 	Once mapping is done, ORM frameworks are going to take care of CRUD operations [ generated using annotations]

	 	Hibernate is a ORM framework [ default provided by Sprng data jpa]

	 	=============

	 	1) Need to write entity classes with @Entity annotation
	 	2) Do the mapping with @Table and @Column
	 	3) need to identify a PK and that field should have @Id annotation
	 	4) can specify @Id to be auto imcrement @GeneratedValue(strategy=IDENTITY)

	 	--
	 	5) Write interface extends JPARepository

	 	6) Spring Data JPA generates class implementing this interface which contains CRUD operations


	  =========

	  	ORMs
	  	 can generate DDL and DML

	  	 DDL ==> ORMs checks if table exists, if exists maps to existing table
	  	 			if not it creates table in database
	  	 			if required it alters also
	  	 DML ==> INSERT, DELETE, UPDATE and SELECT generated

	  	=======

	  	Spring DATA JPA disables AUTO Commit

	  	INSERT SQL , UPDATE SQL or DELETE

	  	commit / rollback

	  	it makes the whole statements within the method as atomic
	  	@Transactional
	  		method() {
	  				1) ..
	  				2) ...
	  				3) ... issues ==> throws Exception
	  				...
	  				...

	  		}


	  Java 8 feature

	  productDao.findById(5) returns Optional<Product>

	  Optional<Product> opt = productDao.findById(id);
	  if(opt)


	  application.properties
	  	==> give details of database to which connection has t o be established


	  hibernate.hbm2ddl-auto=update

	  hbm ==> Hibernate mapping 2 DDL [ CREATE table, alter, drop]

	  update==> if table already exists map it, else create tables


	  ORM should generate SQL for MySQL5

	  JP-QL: @Query("select p from Product p where p.price >= :pr")



	  SQL 	
	  	table and column names
	  	Example:
	  		select * from products where price >= 50000

	  		select * from customers where first_name = 'Ashok';
	  JP-QL
	  	uses class name and fields
	  		select p from Product p where p.price >= 50000

	  		select c from Customer c where c.firstName = 'Ashok';
=============================================================================================

	
		RESTful Web Service

		REPRESENTATIONAL STATE TRANSFER 

		A Resource is present on server [ database , file, tangilbel things like printer, etc]

		Resource can be served to client in various formats [ Representation]

		=======================================================================


		we use the following HTTP headers to serve the data:

		accept: application / json
			"accept"	to serve the data to client

		content-type: text/xml
			"content-type": what type of data the client is sending to server

		=====================

		RESTful uses URI to identify the resource and HTTP methods to perform CRUD operations

		Example:
			http://localhost:8080/api/products
			GET

			--> get all products

			--------

			http://localhost:8080/api/products/5
			GET

			/ path parameter
			--> get product whose id is 5

			--------
			http://localhost:8080/api/products?category=mobile
			GET

			? ==> Query parameter
			get all mobiles [ filter]

			http://localhost:8080/api/products?page=1&size=10
			GET

			pagination


			---------------
			http://localhost:8080/api/products
			POST 

			payload contains the new product which has to inserted into server resource

			---------

			http://localhost:8080/api/products/3
			PUT

			modify product whose PK is 3 with the new data sent as payload

			--------

			http://localhost:8080/api/products/3
			DELETE

			delete product whose PK is 3

			----------

			CREATE ===>  POST
			READ ===> GET
			UPDATE ==> PUT
			DELETE ==> DELETE

			--------------------


			GET and DELETE ==> no payload

			PUT and POST ==> contains payload

			----------------------------------------------


			@RequestBody ==> payload from client

			@ResponseBody ==> payload to client


			--------------

			Order and Lineitem

			============

			Try doing similar actions for Customer // OrderService / CustomerController

			====================================================================================

			

			Customer <----> Order

			1 Customer places many orders [ one-to-many]

			many orders can be placed by a customer [ many-to-one]

			=========

			order <---> items

			1 order has many items
			many items in a order


			==================================================

			Uber / ola / Meru ==> Taxi Service

			Driver
			Vehicle
			Customer
			Trip
			Payment
			Feedback


			Trip is by which Customer
			Trip which driver came
			Trip payment done
			Trip vehcicle engage

			============

			Order application:
				core entity is "order"
				for order establish relationship

				order is by which customer
				order has many items

			=========================================


			Ticket Tracker

			==================

				Employee
				Ticket
				Employee

				Ticket --> employee [ rasied by ] many to one

				Ticket ==> employee [ resolved by] many to one
			================================


			@Embeddable
			class FullName {
					firstName
					lastName
			}

			@Entity
			@Table(name="persons")
			class Person {
				@EmbeddeableId
				FullName name;
				// other fields
			}

			==========

			@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
			@JoinColumn(name="order_fk")
			private List<Item> items = new ArrayList<>();


			1 order has 3 items:

			Without cascade:
				save(i1);
				save(i2);
				save(i3);
				save(order)

				-------	
				delete(i1);
				delete(i2);
				delete(i3);
				delete(order)

			==============

			with Cascade settings

			save(order); // will automatically save all items of order
			delete(order); // will delete all items of order

			===========

			fetch = FetchType.EAGER

			get order will join items and fetch it

			======
			fetch = FetchType.LAZY

			get order will get only order details not items
			again I need to make a call to backedn to get itmes of that order


			=====================

			CustomerController, ProductController, OrderController
			OrderDao, ProductDao, CustomerDao

			==> no ItemController and ItemDao [ not required because of cascade option]

			==============================
			order

			 {
     			"total" : 50900.00,
    			 "customer" : {
        			 "email": "b@adobe.com"
     			},
     			"items" : [
         				{
         					"product" : {"id": 3},
         					"qty" : 2,
         					"amount": 900.00
         				},
         				{
         					"product" : {"id" : 1},
         					"qty": 1,
         					"amount" : 50000.00
         				}
     			]

 		}

 		drop table orders cascade;
 		drop table items cascade;


 		 {
     			"total" : 134000.00,
    			 "customer" : {
        			 "email": "a@adobe.com"
     			},
     			"items" : [
         				{
         					"product" : {"id": 2},
         					"qty" : 1,
         					"amount": 134000.00
         				} 
     			]

 		}

 		=======

 		@RunWith(SpringRunner.class)

 		create spring test bed 


 		@Autowired
		private MockMvc mockMvc;

		we can perform API calls


		=============

		POStMAN to TEST your REST apis

		Junit to TEST MockMvc

		==========================================

		Entity:

			@Entity
			@Table
			@Id

			@OneToMany
			@ManytoOne

			@JoinColumn ===> FK

			Cascade, FETCH

		DAO:
			interface EmployeeDao extends JPARepositiory<Employee, String> {
				@Query(....)
				custom methods()
			}

		Service:
			@Transactional
				INSERT, DELETE and UPDATE

		Constroller:
			@RestController
			@RequestMapping
			@GetMapping() @PostMapping(), ...

		@ResponseBody, @RequestBody
		=============================================

		
