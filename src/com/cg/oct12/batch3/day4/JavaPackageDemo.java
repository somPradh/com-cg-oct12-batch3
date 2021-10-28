package com.cg.oct12.batch3.day4;

import java.util.Random;
import java.util.Scanner;

public class JavaPackageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.SIZE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		int num=2147483647;
		//int num2=2147483649;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("please enter your name");
		String name=scn.next();
		System.out.println("welcome "+ name);
		Random random=new Random();
		System.out.println(random.nextInt());
		

	}

}
