package com.cg.oct12.batch3.day4;

public class FinalDemo {
	final static int NUMBER_OF_OVERS=20;
	private static final int num=10;
	private static int num2=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FinalDemo.num);
		System.out.println(FinalDemo.num2);
		//FinalDemo.num=15;
		FinalDemo.num2=25;
		System.out.println(FinalDemo.num);
		System.out.println(FinalDemo.num2);
		System.out.println(FinalDemo.NUMBER_OF_OVERS);
	}

}
