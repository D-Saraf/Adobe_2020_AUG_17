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

