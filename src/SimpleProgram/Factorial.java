package SimpleProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int i,fact=1,no;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to be found of the factorial");
		no=s.nextInt();
		for(i=2;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial is "+fact);

	}

}
