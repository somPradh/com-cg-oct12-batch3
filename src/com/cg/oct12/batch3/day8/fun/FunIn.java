package com.cg.oct12.batch3.day8.fun;

public interface FunIn {
	public abstract void abstractMethod();
	
	public default void defaultMethod() {
		System.out.println("default method");
	}
	
	

}
