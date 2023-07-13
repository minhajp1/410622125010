package javaLabBook;

import java.util.Scanner;

public class FindAreaOfSquare {
	public static void main(String[] args) {
		System.out.println("Enter Side Of Square:");
		
		Scanner scanner = new Scanner(System.in);
		
		double side = scanner.nextDouble();
		
		double area = side*side;
		System.out.println("Area of Square is:"+area);
	}
}
