package SimpleProgram;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		int a,b,c,x;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any three number");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		 x=(a>b)?((a>c)?a:c):((b>c)?b:c);
       System.out.println("largest number is:"+x);   
	}

}
