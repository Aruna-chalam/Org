package com.hcl.model;

public class MainLambda {

	public static void main(String[] args) {
        
		
	/*	MyInterface myInterface = () -> {System.out.println("Lambda");};
		MyInterfaceWithParam myInterfaceWithParam = (int a) -> {System.out.println(a);};
//		MyInterfaceWithTwoParam myInterfaceWithTwoParam = (int a, int b)-> {System.out.println(a+b);};
		MyInterfaceWithTwoParam myInterfaceWithTwoParam = ( a,  b)-> {System.out.println(a+b);};
        MyInterfaceWithReturn myInterfaceWithReturn = (a, b)->{return a * b;};
        MyInterfaceWithObject myInterfaceWithObject = (obj)->{return obj.getEmpName();};
        MyInterfacereturnObject myInterfacereturnObject =(obj)->{return obj;};
		
		myInterface.sayHello();
		myInterfaceWithParam.method(25);
		myInterfaceWithTwoParam.method(23, 34);
		System.out.println(myInterfaceWithReturn.method(23, 34));
		
		Employee employee = new Employee("101","SarA",10000); 
		System.out.println(myInterfaceWithObject.method1(employee));
		
		Employee employee1 = new Employee("102","Saru",100000); 
		Employee employee2 = myInterfacereturnObject.method(employee1);
		System.out.println(employee2.getEmpId()+" "+employee2.getEmpName()+" "+employee2.getSalary());*/
		
//		Service service = new Service();
//		service.functionOne(8);	
//		System.out.println(service.functionTwo(() -> {System.out.println("Lambda"); }));
		
		MyInterface myInterface = () -> {System.out.println("Lambda");};
		System.out.println(myInterface.add());
		
		
	}
	

}
