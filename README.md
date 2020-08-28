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
		

	 

