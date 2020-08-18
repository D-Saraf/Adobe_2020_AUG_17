package com.adobe.prj.ui;

import java.lang.reflect.Method;

import com.adobe.prj.entity.Mobile;
import com.adobe.prj.entity.Product;
import com.adobe.prj.entity.Tv;

// ctrl + shift + o for windows
// cmd + shift + o for mac

public class ProductClient {

	public static void main(String[] args) {
		
		Product[] products = new Product[5]; // Array of 5 Pointers
		products[0] = new Tv(133, "Sony Bravia", 135000.00, "LED"); // upcasting
		products[1] = new Mobile(453, "MotoG", 12999.00, "4G");
		products[2] = new Tv(634, "Onida Thunder", 3500.00, "CRT");
		products[3] = new Mobile(621, "iPhone XR", 99999.00, "4G");
		products[4] = new Mobile(844, "Oppo", 9999.00, "4G");
//		products[5] = new Product();
		
//		displayExpensiveProducts(products);
//		displayDetails(products);
		displayUsingOCP(products);
	}
	
	// OCP
	private static void displayUsingOCP(Product[] products) {
		for(Product p : products) {
			System.out.println("*************");
			Method[] methods = p.getClass().getMethods(); // RTTI
			for(Method m : methods) {
				if(m.getName().startsWith("get")) {
					try {
						Object ret = m.invoke(p);
						System.out.println(ret);
					} catch(Exception ex) {
						System.out.println(ex);
					}
				}
			}
			System.out.println("*************");
		}
	}

	// Not OCP
	private static void displayDetails(Product[] products) {
		for(Product p : products) {
			System.out.println(p.getName() + "," + p.getPrice());
			// type checking
			if(p instanceof Tv) {
				Tv t = (Tv) p; // type-cast
				System.out.println(t.getScreenType());
			} else if (p.getClass() == Mobile.class) {
				Mobile m = ( Mobile) p;
				System.out.println(m.getConnectivity());
			}
		}
	}
	

	// OCP
	private static void displayExpensiveProducts(Product[] products) {
		for(int i = 0 ; i < products.length; i++) {
			if(products[i].isExpensive()) { // dynamic binding ==> polymorphic behaviour
				System.out.println(products[i].getName() + " is expensive !!!");
			} else {
				System.out.println(products[i].getName() + " is not expensive !!!");
			}
		}
	}

}
