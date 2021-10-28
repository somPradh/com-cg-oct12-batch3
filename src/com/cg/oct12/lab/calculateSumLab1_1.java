package com.cg.oct12.lab;

public class calculateSumLab1_1 {
	

		
		// TODO Auto-generated method stub
		static int calculateSum(int N)
		{
			int sum1;
			int sum2;
			int sum3;
			sum1=(N/3)*(2*3+(N/3-1)*3)/2;
			sum2=(N/5)*(2*5+(N/5-1)*5)/2;
			sum3=(N/15)*(2*15+(N/15-1)*15)/2;
			return sum1+sum2-sum3;
		}
		public static void main(String[] args) {
			int n=20;
			System.out.println(calculateSum(15));
		

	}

}

