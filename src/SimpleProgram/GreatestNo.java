package SimpleProgram;

import java.util.Scanner;

public class GreatestNo {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("biggest number is:"+a);
			}
			else
			{
				System.out.println("biggest number is:"+c);
			}}
			else
			{
				if(c>b)
				{
					System.out.println("biggest number is:"+c);
				}
				else
				{
					System.out.println("biggest number is:"+b);
				}
			}
	}

}
