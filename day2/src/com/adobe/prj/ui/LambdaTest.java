package com.adobe.prj.ui;

public class LambdaTest {

	public static void main(String[] args) {
		// Anonymous class
		Computation add = new Computation() {
			@Override
			public int compute(int x, int y) {
				return x + y;
			}
		};
		System.out.println(add.compute(4, 5));
		
		// Lambda Expression ==> FunctionalInterface
		Computation sub = (int x, int y) -> {
			return x - y;
		};
		System.out.println(sub.compute(4, 5));
		
		Computation mult = (x,y) -> x * y;
		System.out.println(mult.compute(4, 5));
	}
}
