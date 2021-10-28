package com.cg.oct12.lab;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************TRAFFIC LIGHT****************");
		System.out.println("press 1 to Red");
		System.out.println("press 2 to Green");
		System.out.println("press 3 to Yellow");
		
		System.out.println("enter your choice");
		Scanner scn=new Scanner(System.in);
		int choice=scn.nextInt();
		
		Exercise2 tr=new Exercise2();
		switch(choice){
		case 1:
			tr.red();
			break;
		case 2:
			tr.green();
			break;
		case 3:
			tr.yellow();
			break;
		default:
			System.out.println("wrogn input");
	}
}

	public void yellow() {
		System.out.println("TRAFFIC LIGHT IS YELLOW");
		
	}

	public void green() {
		System.out.println("TRAFFIC LIGHT IS GREEN");
		
	}

	public void red() {
		System.out.println("TRAFFIC LIGHT IS RED");
		
	}


}
