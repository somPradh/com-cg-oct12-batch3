package com.cg.oct12.batch3.day8.strm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.cg.oct12.batch3.day4.Employee;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emplist= new ArrayList();
		emplist.add(new Employee(101,"vaman",10000));
		emplist.add(new Employee(111,"aaman",20000));
		emplist.add(new Employee(121,"saman",50000));
		emplist.add(new Employee(131,"raman",30000));
		
		//print thelist
		System.out.println(emplist);
		
		//convert list to stream
		System.out.println("\n convert List to Stream");
		Stream<Employee> empStream=emplist.stream();
		
		//using filter() to get specified data
		System.out.println("\n using filter() to get specified");
		
		Stream<Employee> employeeWithMoreSalary=empStream.filter(e->e.salary>15000);
		
		employeeWithMoreSalary.forEach(e->System.out.println(e));
		
		//using limit() to get limited data
		System.out.println("\nUsing limit() to get limited data");
		Stream<Employee> firstThreeEmp = emplist.stream().limit(3);
		firstThreeEmp.forEach(emp -> System.out.println(emp.toString()));
		
		
		// using skip() to skip specified data - opposite of limit
		System.out.println("\nUsing skip() to skip specified data");
		Stream<Employee> skipFirstThreeEmp = emplist.stream().skip(2L);
		skipFirstThreeEmp.forEach(emp -> System.out.println(emp.toString()));
		
		// using map() to increase salary
		System.out.println("\nUsing map() to increase salary");
		List<Double> salaryHike = emplist.stream().map(emp -> emp.salary += 100).collect((Collectors.toList()));
		salaryHike.forEach(emp -> System.out.println(emp.toString()));
		


	}

}
