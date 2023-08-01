package com.java.anu;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int rollno,m1,m2,m3,m4,m5,total;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter student name:");
		name = scan.next();
		
		System.out.println("Enter the Roll No:");
		rollno = scan.nextInt();
		
		System.out.println("Enter the Tamil mark:");
		m1 = scan.nextInt();
		
		System.out.println("Enter the English mark:");
		m2 = scan.nextInt();
		
		System.out.println("Enter the Maths mark:");
		m3 = scan.nextInt();
		
		System.out.println("Enter the Science mark:");
		m4 = scan.nextInt();
		
		System.out.println("Enter the Social mark:");
		m5 = scan.nextInt();
		
		total = m1+m2+m3+m4+m5;
		
		System.out.println("Name: "+name+"\n"+"Roll No: "+rollno);
		System.out.println("Tamil: "+m1+"\n"+ "English:"+m2+"\n"+ "Maths: "+m3+"\n"+ "Science: "+m4+"\n"+ "Social: "+m5);
	    System.out.println("Total marks: "+total+"/500");	
		
		
		
		
		
		
		
		

	}

}
