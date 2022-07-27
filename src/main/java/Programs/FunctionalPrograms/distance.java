package Programs.FunctionalPrograms;

import java.util.Scanner;

public class distance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter X value: ");
		int x=scan.nextInt();
		System.out.println("Enter Y value: ");
		int y=scan.nextInt();
		int a=(int) Math.pow(x, 2);
		System.out.println(a);
		int b=(int)Math.pow(y, 2);
		System.out.println(b);
		int r=a+b;
		System.out.println(r);
		double result=(double) Math.sqrt(r);
		System.out.println("Result: "+result);
	}

}
