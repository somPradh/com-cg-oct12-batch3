package com.cg.oct12.batch3.day8.fun;

public class App /*implements FunIn*/ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//App obj=new App();
		//obj.abstractMethod();
		FunIn obj=()->{
			System.out.println("functionalMethod");
		};
		

	}
	public void abstractMethod() {
		System.out.println("abstract method");
	}

}
