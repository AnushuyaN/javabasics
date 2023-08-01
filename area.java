package com.java.anu;

public class area {
	
	int a=2,b=3,c=5;
	
	public void peri() {
		int perimeter;
		perimeter=a+b+c;
		System.out.println("Perimeter of triangle : " + perimeter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length=5,breadth=7;
		int area,perimeter;
		area = length * breadth;
		perimeter = 2 * (length + breadth);
		System.out.println("Area of rectangle : " + area);
		System.out.println("Perimeter of rectangle : " + perimeter);
		
		area ar = new area();
		ar.peri();
		
		System.out.println((((8+2345)/3)%5)*5);
		
		//boolean a=(23==45);
System.out.println(23==45);
	}

}
