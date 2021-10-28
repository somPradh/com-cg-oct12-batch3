package com.cg.oct12.lab;

public class PowerLab1_4 {

		
		// TODO Auto-generated method stub
		static boolean checkNumber(int n) {
			if (n==0)
				return false;
			while(n!=1) {
				if(n%2!=0)
					return false;
				n=n/2;
			}
			return true;
		}
		public static void main(String[] args) {
			if(checkNumber(20)) 
				System.out.println("yes");
			else
				System.out.println("no");
		

	}

}


