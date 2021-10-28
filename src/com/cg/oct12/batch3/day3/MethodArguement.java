package com.cg.oct12.batch3.day3;

public class MethodArguement {

		static int addTwoNumbers(int i, int j) {
			return i + j;
		}

		static void addTwoAndPrint(int i, int j) {
			System.out.println(i + j);
		}

		public static void main(String[] args) {

			int output = MethodArguement.addTwoNumbers(10, 20);

			System.out.println(output);
			System.out.println(MethodArguement.addTwoNumbers(20, 30));
			MethodArguement.addTwoAndPrint(10, 20);
		}
	

}
