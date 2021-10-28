package com.cg.oct12.batch3.day3;

public class MethodDemo {
	
	static void hello() {
		System.out.println("hello world");
	}
	void hi() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		MethodDemo.hello();
		MethodDemo obj=new MethodDemo();
		obj.hi();
		System.out.println("ends");

	}

}
