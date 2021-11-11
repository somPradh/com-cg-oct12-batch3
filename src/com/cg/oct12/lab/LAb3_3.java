package com.cg.oct12.lab;

import java.util.Scanner;

public class LAb3_3 {
	
	 public String getImage(String str)
     {
            StringBuffer sbr = new StringBuffer(str);
            sbr.append('|');
            StringBuffer sb = new StringBuffer(str);
            sb.reverse();
            sbr.append(sb);
            return sbr.toString();
     }
     public static void main(String[] ar)
     {
          LAb3_3 p = new LAb3_3();
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a String");
            String str = s.next();
            System.out.println(p.getImage(str));
     }

}
