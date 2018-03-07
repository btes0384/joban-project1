package SimpleProgram;

import java.util.Scanner;

public class Length {

	public static void main(String[] args) {
		int i,n,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		n=s.nextInt();
		while(n>0)
		{
			count++;
			n=n/10;
		}
		System.out.println("length of number is"+count);

	}

}
