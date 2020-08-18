# Java

-------

Banuprakash C
Co-founder Lucida Technologies Pvt Ltd.,

Full Stack Architect

banu@lucidatechnologies.com

banuprakashc@yahoo.co.in

https://www.linkedin.com/in/banu-prakash-50416019/
--------------------------------------------------

Softwares Required:

1) JDK:
	https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html

2) Eclipse for JEE:
	https://www.eclipse.org/downloads/packages/release/2020-06/r/eclipse-ide-enterprise-java-developers

3) MySQL:
	I will share the installation document on GIT

=======================================================================

	Java -- 3 days
		OOP, Basics of Exception handling, Java Collection Frameworks, concurrency
		Connecting with MySQL database and Web application development
		RESTful APIs using Spring Boot

	----------------------------------------------------------------------

	What is OOP?
		Object Oriented Programming
			==> Writing your code which resemble real world.
			Tv, AC, mobile, laptop are examples of real world objects

			we communicate with Objects by sending messages
			 I need to understand what the message does/ Don;t need to know how it is working



			 Messages ==> Functions / Actions

		SOLID Design Principle
		----------------------

			S ==> Single Responsibility

			O ==> Open Close Principle

				Objects should be open for extension and closed for Change.

				void sort(....) {

				}

			L ==> Liskov Substitution Principle

				  Relationship between objects [ Generalization and Specialization]	

				  	Pen and Marker Pen

				  	Pen is generalized form
				  	Marker Pen is a specialied Pen

				  	Marker Pen should do all that a Pen does [ all the capabilites] + it can achieve more

			I ==> Interface segregation

				Objects should have multiple interfaces

				Banking application [ Service object]: Manager has different interface, customer has different interface

			D ==> Dependency Injection
				Inversion Of Control

				Object to communicate with database
					==> They write code to establish database connection

				DI: --> connection is injected into your object


			What is an Object?
				Object contains state and behaviour

				State of object:
					A/C --> Temperature

				Behaviour / Actions / Messages:
					on / off / increase / decrease / swing

				BankingAccount:
					State: balance
					Behaviour: deposit / withdraw 

			How am i going to create object?
				Blueprint is required
				JS --> function as blueprint

				function Account() {
					// state balance
					// behaviour ==> deposit, withdraw, getBalance
				}

				var myacc = new Account(); // instance

				var rahulAcc = new Account(); // instance


				C++ / Java / C#

				class Account {

				}

			In Oracle 
				Type Account


			----------------------------------------------------------------------------------------------
			
			What is Java? 
				Java is a Technology.

			Platform  + APIs

			code to execute on this platform

			How you develop the code?
				we need programming language


			Java Source Code 	==> Java Compiler ===>   Byte code

			Groovy source code   ==> Groovy Compiler ===> Byte Code

			Kotlin source code ===> Kotlin Compiler ===> Byte code

			--------------------------------------------------------------------------------------------


		Java Platform has JRE ==> Java Runtime environment [ Class loader + JVM ( Java Virtual Machine )]


		ClassLoader : loads the the "bytecode" ==> .class extension from secondary storage to primary 

		Where does the class loader look for ".class" file

		==> 1) looks in current project where it is executed from
			2) looks in path specified by CLASSPATH environment varaible

			set CLASSPATH=d:\myproject;e:\code


		======================================================================================

		Logical grouping of class/object for enterprise application

		1) Entity / Domain / Model class
			==> they represent business data
			==> data which is long lived, beyond the life of application

			Amazon
				Customer, Product, Order, Delivery ,....

			Uber / Ola
				Customer, Driver, Vehicle, Trip, Payments

			==> Persistence [ RDBMS / NoSQL / File system]


			Entity classes should have accessors/mutation on fileds

			getters and setters

		2) DAO ==> Data Access Objects [ DAL ]
			==> they contain CRUD code 
				CREATE READ UPDATE and DELETE operations
				if storage is RDBMS , they these classes contain SQL

		3)  Service classes
			acts as facade over DAO and business classes

		4) Business classes
			any business logic like validation and apply other buiness rules

		5) UI Classes
			Web / Mobile / Standalone

		6) Utility classes
			Helpers


		Banking Service

			Transactional ==> Atomic operations
			void transaction(Account from, Account to, double amt) {
					==> do business validation
					==> debit from "from account"
					==> credit int "to account"
					==> update "transaction table"
			}

		===========================================================================

		In Java we use packages to logically group these classes
			==> packages are folder internally


			context.action(arguments)

			context.behaviour(arguments)

			tv.on() ===> on (this)

			light.on()

			ac.on();

=============================================================
	

		In Java we allocate memory on heap area [ for objects and arrays] using "new" keyword.

		memory in heap are is cleaned up by garbage collector if it's not referenced

		Garbage Collector is a part of JRE, it's a low priorty thread whose job is to clean
		up unused heap memory

		We don't release memory

		-----------------

		C and C++ we release memory [ free(ptr) or delete(ptr)]

		---------

		In Java, JavaScript, C# and any other language code which uses VM concept uses Garbage collector


		--------------------------------------------------------------------

		Constructor
			==> looks like method
			==> same name as that of class
			==> no explicit return type
			==> invoked when object is created	


		Compiler creates default constructor if we don't write any.

		Once we write parameterized constructor, it's our resp to write even default

		--------------------------------------------------------------------------------

		Always in Java, any memory on heap contains default values
		int ==> 0
		double == 0.0
		boolean ==> false
		objects ==> null
		char ==> null character

		-------------------

		we need to track how many account objects are created?
		==> track # of constrcutor calls
		==> need  a variable to store that value

		---------

		static methods are invoked using class context instead of object context
		==> class call

		==> first argument is not implicit "this"

		------------

		Objects equality
		------------------

			== vs equals()

			Rectangle r1 = new Rectangle(4,5);

			Rectangle r2 = new Rectangle(4,5);

			Rectangle r3 = r1;

			same or similar

		===========

		primitive types ==> == operator compares data
		object types ==> == compares address 

		int x = 10;
		int y = 10;

		x == y; // true

		r1 == r2; // false

		===============================


		in C++;
			Account a1 = new Account(); // on heap
			Account a2; // stack

			Account a3 = a1; // copy constructor

		===================================

		equals() is meant to compare data on heap area

		Rectangle r1 = new Rectangle(4,5);

		Rectangle r2 = new Rectangle(4,5);

		r1.equals(r2); // should evaluate to ==> true

		================

		Every object in Java inherits from java.lang.Object class

		r1.equals(r2);
			default ==> (r1 == r2)

		==============

		tea break: resume @ 3:55

		==========================================


			1) new keyword
			2) GC removes unused objects
			3) instance variables ==> state of object [ balance ]
			4) methods
				instance methods:
					context.method()
					context is object
				static methods:
					context is class
			5) static variables ==> state of class [ count ==> shared by all objects of a Class]

			6) constructors
				called when object is created
			7) == vs equals()

		==============================================

		Relationship between objects
			1) Generalization and Specialization [ IS A ]
			2) Association [ HAS A]
			3) Realization
			4) uses A relationship


			====

			Mobile : getId() setId() getName() setName() getPrice() setPrice() ....

			Tv:  getId() setId() getName() setName() getPrice() setPrice() ....


			Tools used by Java developers
			-------------------------------

			1) Maven
			2) Checkstyle
			3) PMD / findBugs
			4) Jenkins ==> CI / CD
			5) Sonar
			6) Unit Testing / UAT tools ...


			Checkstyle:
				==> to check Naming conventions , empty spaces, brackets

					class oracleconnection {

					}

					==>

					prefer camel case for class names , variables and methods:

					class OracleConnection {

					}

					Tea getMeTea() { // getmetea() 

					}

					=> constants use SNAKE case with only upper case characters

					MAX_AGE = 100;

			PMD / spotbugs / findbugs
				==> coding stds
					==> unreachable code

						doTask() {
								if(1 == 1)
									return 100;
								statements;
						}

					==> empty blocks

					if(condition) {

						} else {
							statments
						}
					==> empty catch block

					try {
							// code
						} catch(Exception ex){}

					==> Copy & Paste Code
						==> DRY principle ==> Don't repeat yourself

						=============


						Shop:

						point to Mobile and ask "what is the cost of this product"?

						point to tv and ask "is this product for Sale?"

						point to tv and ask "is this object for Sale?"

						=================

						Tv in my pocket

						 Reply by Tom Alter: 14" or 32" pocket


						Mobile in pocket which "HAS A" Tata Sky Tv App.

						==================

		Generalization and Specialization [ IS A ] is acheived in programming languages using "inheritance"

		In java "extends" is a keyowrd to create specialized object types

		class Product {

		}

		class Mobile extends Product {

		}

		class Tv extends Product {

		}

		===============================================================

		constructors and inheritance:


		class Product {
			Product() {
					prints "P1";
			}
			Product(int id) {
					prints "P2";
			}
		}

		class Mobile extends Product {
			Mobile() {
				prints "M1";
			}

			Mobile(int id, String connectivity) {
					prints "M2";
			}
		}


		new Mobile(); //    P1 and M1

			==> Object(), Product() and Mobile()

		new Mobile(134, "4G"); //  P1 and M2 .. 

		===============

		class Product {
			Product() {
				prints "P1";
			}
			Product(int abc) {
					prints "P2";
			}
			 
		}

		class Mobile extends Product {
			Mobile() {
				super();
				prints "M1";
			}

			Mobile(int id, String connectivity) {
					super(id); // has to be the first statement in constructor
					prints "M2";

			}
		}


		new Mobile(); //    P1 and M1

			==> Object(), Product() and Mobile()

		new Mobile(134, "4G"); //  P2 and M2 .. 
		 
		=================================================================


		class Product {
			public int getPrice() {
					return 100;
			}

			public String getId() {
					return "1";
			}
		}

		class Mobile extends Product {

			public int getPrice() {
					return  500;
			}

			public String getconnectivity() {
					return "4G";
			}
		}

		Mobile m = new Mobile();              				Product p = new Mobile(); // upcasting
		m.getPrice(); // 500  								p.getPrice(); // 500 
		m.getId(); // 1 									p.getId(); // 1
		m.getConnectivity(); // 4G							p.getConnectivity(); // Compilation ERROR


		Object o = new Mobile(); // upcasting	


		// Dynamic binding

	==========================================================================================

	connectivity.equals("4G")

	if connectivity is not set, it throws NullPointerException


	"3G".equals(connectivity)

		"3G".equals(null)

		false


	Mobile[] mobiles = new Mobile[10000];
	Tv[] tvs = new Tv[2000];

	for(int i = 0; i < mobiles.length; i++) {
			if(mobiles[i].isExpensive()) {

			}
	}


	for(int i = 0; i < tvs.length; i++) {
			if(tvs[i].isExpensive()) {
					
			}
	}

	DishWasher[] dw = new DishWasher[600];
	for(int i = 0; i < dw.length; i++) {
			if(dw[i].isExpensive()) {
					
			}
	}

	======================================

# Day 2

	---------
	Day 1:
	how to create object
	how to create arrays
	instance and static methods and variables
	inheritance ==> generalization and specialization relationship
	dynamic binding ==> polymorphism
	----------------------------


	Product is too generic, In real world there is nothing called as product.

	Account is also too generic.


	p instanceof Object ==> true

	p instanceof Product ===> true

	p instanceof Tv ===> true

	p instanceof Mobile ===> false


	==========

	p.getClass() ===>  [ new Mobile()]



	try {
						Object ret = m.invoke(p);
						System.out.println(ret);
		} catch(Exception ex) {
						System.out.println(ex);
		}


		Traditional way of invoking instance methods [ if name of method is know in advance]

			<<context>>object.method(); ==> method(<<this>>object) ; 



			@Secure(ROLE="ADMIN")
			public double getPrice() {

			}
	============================================================

	Generic Data type

	class Rectangle <T> { 						class Rectangle {
			T width;								Object width;
			T breadth;								Object breadth;

			... 									..........
	} 											}

	<T> is a generic Type ==> T can be of Object type only and not primitive type

	Rectangle<Integer> r1 = new Rectangle<Integer>(4,5);
	Rectangle<Double> r2 = new Rectangle<Double>(1.4,3.5);
	Rectangle<String> r3 = new Rectangle<String>("A","B");


	Integer is a typewrapper for int

	Double is a typewrapper for double data type

	===========

		int x = 10; // primitive

		Integer iX = x; // boxing ==> wrapped primitive x into object iX

		int y = iX; // unboxing

	==========

	class Rectangle <T extends Number> { 						class Rectangle {
			T width;												Number width;
			T breadth;												Number breadth;

			... 													..........
	} 														}

	Rectangle<Integer> r1 = new Rectangle<Integer>(4,5);
	Rectangle<Double> r2 = new Rectangle<Double>(1.4,3.5);
	Rectangle<String> r3 = new Rectangle<String>("A","B"); // compilation error

	================================================================================================


	Realization Relationship
	------------------------

		Object/component will realize the behaviour specified by other in order to communicate.

		Object A ==> specifies certain protocols

		Any object which follows these protocols can communicate with "A"

		In real world this is done using interface [ HDMI / VGA ]

		interface interfaceName {
			abstract methods();
		}

		=====================

		interface EmployeeDao {
				void addEmployee(Employee e);
				Employee getEmployee(int id);
		}



		all methods in interface by default are public and abstract

		==================

			Why do developers need to program to interface?
				1) DESIGN
				2) IMPLEMENTATION
				3) TESTING
				4) INTEGRATION
				5) LOOSE COUPLING


 	============

 	1) clients are many and hetergeneous
 	2) Avoid exposing the implementation to client
 	==> use factory classes to overcome these issues

 	Factory ==> create object

 	===================================

 	How to create objects?

 		1) If we know the class name:

 			new ClassName(); // new Employee();

 		2) If we don't know the class name in advance:

 			String str = ... read from config file and assign to "str"

 			str = "com.adobe.prj.dao.EmployeeDaoMongoImpl";

 			Class.forName(str).newInstance(); // RTTI ==> Reflection API



 		============

 		Class.forName("java.lang.String").newInstance();

 		Class.forName("java.lang.Date").newInstance();

 		Class.forName("com.adobe.prj.dao.EmployeeDaoMongoImpl").newInstance();

 		===========

 		interfaces for Strategy Pattern ==> switch between stratgery [ mongo and mysql]
 			Loose coupling
 		===========

 		abstract class ==> generalization relationship
 			can have state + behaviour

 		interface ==> realization relationship
 			can't have state

 		=========================



 			obj1
 			obj2


 			if(obj1.compareTo(obj2) > 0) {
 				swap code ....
 			}

 			===========================================================================


 			String implments Comparable
 			Comparable c = new String("a");

 			Product implments Comparable
 			Comparable c = new Mobile(); 

 			===============================

 			interface Swim {							Dance d = new Actor();
 				swim();											d.dance();
 			} 											

 			interface Dance {							Fight f = new Hero();
 				dance();	 							f.fight(); // works
 			}											f.dance(); // won't work
 														f.swim(); // won't work
 			interface Fight { 							Dance d = (Dance) f;
 				fight(); 								d.dance(); //works
 			}

 			// Actor can dance
 			class Actor implements Dance {
 				dance() {....}
 			}

 			// Hero is an actor, hero can dance
 			class Hero extends Actor implements Swim, Fight{
 				swim() {...}
 				fight() { .... }
 			}	

 			=============================================================

 			FunctionalInterface is an interface where only one method needs to be implemented

 			interface Flyable {
 				fly();
 			}

 			--
 			Not a FunctionalInterface
 			interface EmployeeDao {
				void addEmployee(Employee e);
				Employee getEmployee(int id);
			}

			-----------------------------------------------
			PermGen error happens when application is started
			java -xms:12MB   MyApplication
			interface Flyable {
 				fly();
 			}

 			class Bird implements Flyable {
 				//state
 				// other behaviour
 				fly() {..}
 			}

 			class AeroPlane implement Flyable {
 				// state
 				// other behaviour
 				fly() {..}	
 			}

 			Flyable f = new Bird();
 			Flyable f = new AeroPlane();

 			Flyable f = new Flyable(); //error

 			// Anonymous class
 			Flyable f = new Flyable() {
				fly() { .... }
 			};


 			class Dummy1 implements Flyable {
 				fly() {
 					try jump from 6th floor
 			}
 		}

 			class Dummy2 implements Flyable {
 				fly() {
 					now try jump from 10th floor
 			}
 		}

 	================================================================================

 	Exception Handling
 	------------------
 		Exception: An abnormal condition that arises during program execution.
 				An exception can be error type [ can't handle] or exception type [ can provide alternate flow]

 				Error Type> Memory issues / JVM crash / Stack Overflow / UnsatisfiedLinkError

 				Exception Type> DB Connection issues/ FileNotFound  / NullPointer

 		In Java Exception is an object which gives the following info:
 			a) What went wrong?
 			b) Where ?
 			c) Why ?

 		========================================

 		Exception Types can be again classified as "Checked Type" and "Unchecked Type"


 		Unchecked Type 									
 		1) these exceptions occur due to reasons with JRE	
 		2) NullPointerException / ArithmeticException / ArrayIndexOutOfBoundsException / ClassCastException

 			Employee e;
 			e.setId(100); // NullPointerException

 			int[] elems = {4,6};
 			int x = elems [10]; //ArrayIndexOutOfBoundsException
 		3) Handle using conditional statement

 			public void display(Employee e) {
 				if(e !== null) {
 					syso ( e.getName() + "," + e.getId());
 				}
 			}

 			int[] elems = {4,6};
 			int index = 10;
 			if(index >= 0 && index < elems.length) {
 				int x = elems[index];
 			}

 		Checked Type
 		1) Reasons are outside of JRE
 		2) SQLException / IOException / ClassNotFoundException
 		3) should be handled using try-catch syntax

 			try {
 				//
 			} catch(SQLException ex){
 				// alternate flow or display proper message to user
 			}
 		4) Compiler enforces you to handle using try-catch syntax

 	======================================================================================

 	Java Collection Framework [ Data containers]
 	--------------------------------------------
 	