package com.hcl.service;

import com.hcl.model.MyInterface;

public class Service {
	
	public void functionOne(int a){
		
		System.out.println("Result : "+(a+100));
	}

	public String functionTwo(MyInterface myInterface) {
		
		myInterface.sayHello();
//		System.out.println("HAI");
		return "vaada";
		
	}
	
}
