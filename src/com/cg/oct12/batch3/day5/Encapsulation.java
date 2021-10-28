package com.cg.oct12.batch3.day5;

class Employee{
	private int eid;
	private String ename;
	
	public int get1() {
		return eid;
		
	}
	public String get2() {
		return ename;
	}
	public void set2(int id) {
		this.eid=eid;
		}
	public void set1(String name) {
		this.ename=name;
	}	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.set2(1234);
		emp.set1("ok google");
		System.out.println(emp.get1());
		System.out.println(emp.get2());
		

	}

}
