package com.cg.oct12.lab;

import java.util.Scanner;
public class IncreasingLab1_3 {
	


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			boolean flag=false;
			Scanner scn=new Scanner(System.in);
			System.out.println("enter a number");
			int num=scn.nextInt();
			int currentDigit=num%10;
			num=num/10;
			while(num>0) {
				if(currentDigit <= num%10) {
					flag=true;
					break;
				}
				currentDigit=num%10;
				num=num/10;
			}
			if(flag) {
				System.out.println("Digits are increasing");
			}
			else {
				System.out.println("Digits are  increasing");
			}

		}

}
