package com.cg.oct12.lab;

import java.util.Scanner;

public class Lab3_1 {
	 public static void main(String args[]) {
	        int n;
	        int sum = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter integers with one space gap:");
	        String s = sc.nextLine();
	        Lab3_1 st = new Lab3_1();
	        while (st.hasMoreTokens()) {
	            String temp = st.nextToken();
	            n = Integer.parseInt(temp);
	            System.out.println(n);
	            sum = sum + n;
	        }
	        System.out.println("sum of the integers is: " + sum);
	        sc.close();
	    }

	private String nextToken() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean hasMoreTokens() {
		// TODO Auto-generated method stub
		return false;
	}

}
