package com.cg.oct12.lab;

import java.util.Scanner;

public class Lab3_2 {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER the String value");
	String s1 = sc.nextLine();
	String reverse = new StringBuffer(s1).reverse().toString();

	System.out.println(s1 + "|" + reverse);
	sc.close();
}


