package com.cg.oct12.batch3.day8.comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class App {
public static void main(String[] args) {
		empList.add(new Employee(102, "Monu", 20.6));
		empList.add(new Employee(103, "Tonu", 40.6));
		empList.add(new Employee(104, "Ponu", 30.6));
		System.out.println(empList);

//		Collections.sort(empList);
		System.out.println("Nefore sort");

		System.out.println(empList);
		for (Employee e : empList) {
			System.out.println(e.toString());
		}

//		List<Integer> list = new ArrayList<>();
//		System.out.println(list);
//		list = new LinkedList<>();
//		list = new Stack<>();
//
//		ArrayList<Integer> list2 = new ArrayList<>();
//		System.out.println(list2);
////		list2 = new LinkedList<>();
		Collections.sort(empList, new SortBySalary());

		System.out.println("After sort");

		for (Employee e : empList) {
			System.out.println(e.toString());
		}

	}