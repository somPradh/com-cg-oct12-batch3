package com.cg.oct12.batch3.day3;

class HdfcBank{
	static String ifsc;
	double balance;
	void checkBalance() {
		System.out.println(this.balance);
	}
}


public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HdfcBank obj=new HdfcBank();
		obj.balance=1000;
		obj.checkBalance();
		
		HdfcBank.ifsc="Hdfc0001";
		System.out.println(HdfcBank.ifsc);

	}

}
