package com.hcl.model;

@FunctionalInterface // it allows only one interface
public interface MyInterface {

	public void sayHello();

	public default int add() {
		return 9 + 14;
	}

}
