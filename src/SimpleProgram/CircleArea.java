package SimpleProgram;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		double r,area;
		double PI= 22/7;
		Scanner s= new Scanner(System.in);
		System.out.println("enter radius of circle:");
		r=s.nextDouble();
		area=2*PI*r;
		System.out.println("area of circle is:"+area);

	}

}
