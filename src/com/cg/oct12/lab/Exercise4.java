package com.cg.oct12.lab;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		for(int i=2;i<num;i++) {
			int p=0;
			for(int j=2;j<i;j++) {
				if(i%j==0)
					p=1;
			}
			if(p==0)
				System.out.println(i);
		}
		

	}
}
