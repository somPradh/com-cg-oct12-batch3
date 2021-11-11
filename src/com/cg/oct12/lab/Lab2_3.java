package com.cg.oct12.lab;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2_3 {
	public static void main(String[] args) {           
		Lab2_3.getSorted();
		
	}
	public static void getSorted() {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		int n;
		System.out.print("Enter number of elements : ");
	
		n = sc.nextInt();

		int arr[] = new int[n]; 
		System.out.println("Enter the numbers : ");
		for (int i = 0; i < n; i++) 
		{
			arr[i] = sc1.nextInt();
		}

		Arrays.sort(arr); 

		System.out.println(Arrays.toString(arr)); 
		sc.close();
		sc1.close();
	}

}
