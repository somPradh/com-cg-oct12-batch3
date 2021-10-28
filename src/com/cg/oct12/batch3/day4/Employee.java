package com.cg.oct12.batch3.day4;

public class Employee {
	int eid;
	String name;
	public double salary;
	public Employee() {
		System.out.println("zero-arg const");
	}
	
	
@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}


public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

//	public Employee(int eid,String name,double salary) {
//		this.eid=eid;
//		this.name=name;
//		this.salary=salary;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.eid = 101;
		emp.name = "Jeevan";
		emp.salary = 10.5;
	//	System.out.println(emp.eid + " " + emp.name + " " + emp.salary);
		System.out.println(emp.toString());
		
		
		Employee emp2 = new Employee();
		emp2.eid = 102;
		emp2.name = "Ajeet";
		emp2.salary = 10.6;
		//System.out.println(emp2.eid + " " + emp2.name + " " + emp2.salary);
		System.out.println(emp2.toString());
		
		
		Employee emp3 = new Employee(103,"ok",10.3);
		//System.out.println(emp3.eid + " " + emp3.name + " " + emp3.salary);
		System.out.println(emp3.toString());
	}

}
