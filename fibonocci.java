package com.java.anu;

import java.util.Scanner;

public class fibonocci 
{

	public static void main(String[] args) 
	{
	 int a=0,b=1;
	 Scanner get = new Scanner(System.in);
	 System.out.println("Enter the number: ");
	 int n = get.nextInt();
	 System.out.print(a+"  ");
	 System.out.print(b+"  ");
	 for(int i=1;i<=n;i++)
	 {
		 int c=a+b;
		 System.out.print(c+"  ");
		 a=b;
		 b=c;
		 
	 }
	 
	 

	}

}
