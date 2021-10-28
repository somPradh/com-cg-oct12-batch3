package com.cg.oct12.batch3.day8.collections;

import java.util.ArrayList;

public class CollectionDemo1 {
	public static void main(String[] args) {
       	ArrayList<Comparable> al = new ArrayList<Comparable>();
       	al.add(20); // auto boxing
       	al.add(10.5); // duplicates allowed
       	al.add("Vaman"); // Heterogeneous data allowed
       	al.add(new Integer(10)); // boxing
       	System.out.println(al);
 	}


}
