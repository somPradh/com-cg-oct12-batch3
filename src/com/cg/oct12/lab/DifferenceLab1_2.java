package com.cg.oct12.lab;

public class DifferenceLab1_2 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int sum1=0;
			int sum2=0;
			for(int i=1;i<=10;i++) {
				sum1=sum1+i*i;
				sum2=sum2+i;
			}
			System.out.println(sum2*sum2-sum1);

		}

	}
