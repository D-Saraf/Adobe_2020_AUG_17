package com.adobe.prj.ui;

import java.util.Arrays;
import java.util.Comparator;

import com.adobe.prj.entity.Mobile;
import com.adobe.prj.entity.Product;
import com.adobe.prj.entity.Tv;

public class ArraysExample {

	public static void main(String[] args) {
		String[] names = { "Danny" , "Lee", "Angelina" , "Brad", "George"};
		
//		Arrays.sort(names);
		
//		Arrays.sort(names, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.length() - o2.length();
//			}
//		});
		
		Arrays.sort(names, (o1, o2) -> o1.length() - o2.length());
		
		for(String name : names) {
			System.out.println(name);
		}
		
		Product[] products = new Product[5]; // Array of 5 Pointers
		products[0] = new Tv(133, "Sony Bravia", 135000.00, "LED"); // upcasting
		products[1] = new Mobile(53, "MotoG", 12999.00, "4G");
		products[2] = new Tv(634, "Onida Thunder", 3500.00, "CRT");
		products[3] = new Mobile(621, "iPhone XR", 99999.00, "4G");
		products[4] = new Mobile(84, "Oppo", 9999.00, "4G");
		
//		Arrays.sort(products);
		Arrays.sort(products, (p1, p2) -> p1.getName().compareTo(p2.getName()));
		
		for(Product p : products) {
			System.out.println(p);
		}
		
		System.out.println("**********");
		
	}

}
