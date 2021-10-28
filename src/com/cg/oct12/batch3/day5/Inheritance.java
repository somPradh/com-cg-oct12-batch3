package com.cg.oct12.batch3.day5;

class Child{
	int num;
}
public class Inheritance extends Child {
	int num2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance in=new Inheritance();
		in.num2=10;
		in.num=20;
		System.out.println(in.num2);
		System.out.println(in.num);

	}

}
