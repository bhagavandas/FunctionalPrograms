package Programs.FunctionalPrograms;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int[][] array = new int[3][3];
		Scanner obj = new Scanner(System.in);
		int i,j;
		System.out.println("Enter the values: ");
		for(i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				array[i][j]=obj.nextInt();
				
			}
		}
		System.out.println("2D array is : ");
		for(i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				System.out.print(array[i][j]+ " ");
	}
			System.out.println();
		}
}
}