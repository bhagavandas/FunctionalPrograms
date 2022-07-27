package Programs.FunctionalPrograms;

import java.util.Scanner;

public class windChill {
	public static void main(String[] args) {
		
		double v=0,t = 0,a,b;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter t value: ");
		t=obj.nextInt();
		System.out.println("Enter v value: ");
		v=obj.nextInt();
		if(t<50 && v>3 && v<120 ) {
			double w=(int) (35.74 + 0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16));
			System.out.println("Windchill: " + w);
		}
		else {
			System.out.println("Values should be t<50,v>3,v<120, It is invalid, Please Enter another values ");
		}
	}

}
