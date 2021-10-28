package com.cg.oct12.batch3.day8.collections;

import java.util.ArrayList;

public class CollectionDemo2 {
	 	public static void main(String[] args) {
	       	ArrayList<Integer> al = new ArrayList<Integer>();
	       	al.add(new Integer(10));
	       	al.add(10);
	       	// al.add(10.5); // CE : not allowed
	       	// al.add(new Float(34.56)); //CE : not allowed
	       	System.out.println(al);
	 	}
	}
