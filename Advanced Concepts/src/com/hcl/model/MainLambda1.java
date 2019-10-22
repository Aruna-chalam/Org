package com.hcl.model;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class MainLambda1 {

	public static void main(String[] args) {

		BiConsumer<Integer, Integer> biConsumer = (a,b)->{System.out.println(a+b);};
		biConsumer.accept(10, 10);

		BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> {return (a + b);};
		int val = biFunction.apply(25, 60);
		System.out.println(val);
		
		BiFunction<Integer, Integer, String> biFunction1 = (a, b) -> {return ("Sum : "+(a + b));};
		String val1 = biFunction1.apply(25, 60);
		System.out.println(val1);
		
		BiFunction<String, String, String> biFunction2 = (a, b) -> {return (a +" "+ b);};
		String val2 = biFunction2.apply("Hai", "Bye");
		System.out.println(val2);

	}

}
