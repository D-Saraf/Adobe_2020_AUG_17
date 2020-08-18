package com.adobe.prj.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.adobe.prj.entity.Product;

public class ProductListExample {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(645, "Hp Laptop", 135000.00, "computer"));
		products.add(new Product(224, "iPhone", 98000.00, "mobile"));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer"));
		products.add(new Product(5, "Sony Bravia", 125000.00, "tv"));
		products.add(new Product(912, "One Plus", 32000.00, "mobile"));
		products.add(new Product(88, "HP Printer", 19000.00, "computer"));
		
		Collections.sort(products, (p1,p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
		//Collections.sort(products, (p1,p2) -> (int)(p1.getPrice() - p2.getPrice()));
//		display(products);
		
//		products.stream()
//			.filter(p->p.getCategory().equals("mobile"))
//			.forEach(p->System.out.println(p));

		// method reference
		products.stream()
		.filter(p->p.getCategory().equals("mobile"))
		.forEach(System.out::println);

		
		System.out.println("***********");
		
	}

	private static void display(List<Product> products) {
		for(Product p : products) {
			System.out.println(p);
		}
	}

}
