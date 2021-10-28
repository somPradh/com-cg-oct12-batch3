package com.cg.oct12.lab;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value for n");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int a=1;
		int b=1;
		int c=0;
		for(int i=0;i<n-2;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(""+c);
		}
		System.out.println();
		System.out.print("nth value of fibonacci series is: "+c);
		
		
		

	}


}
