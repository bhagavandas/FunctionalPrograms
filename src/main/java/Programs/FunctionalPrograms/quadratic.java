package Programs.FunctionalPrograms;

import java.util.Scanner;

public class quadratic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 'a' Value: ");
		int a=scan.nextInt();
		System.out.println("Enter 'b' Value: ");
		int b=scan.nextInt();
		System.out.println("Enter 'c' Value: ");
		int c=scan.nextInt();
		double delta = b*b - 4*a*c;
		System.out.println("Delta : " + delta);
		double x = (-b + Math.sqrt(delta))/(2*a);
		double y = (-b - Math.sqrt(delta))/(2*a);
		System.out.println("Roots of X are : " + x);
		System.out.println("Roots of X are: "+ y);
		
	}

}