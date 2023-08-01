package com.java.anu;

public class area 
{
	
	int a=2,b=3,c=5;
	int length=5,breadth=7;
	int area,perimeter;
	
	public void peri()
	{
		int perimeter;
		perimeter=a+b+c;
		System.out.println("Perimeter of triangle : " + perimeter);
	}

	public void rect()
	{
		area = length * breadth;
		perimeter = 2 * (length + breadth);
		System.out.println("Area of rectangle : " + area);
		System.out.println("Perimeter of rectangle : " + perimeter);
	}

	public static void main(String[] args) 
	{
		area ar = new area();
		ar.peri();
		ar.rect();
	}

}
