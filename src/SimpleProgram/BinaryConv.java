package SimpleProgram;

import java.util.Scanner;

public class BinaryConv {

	public static void main(String[] args) {
		int num,bin,dec=0,base=1,rem;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		bin=num;
		while(num>0)
		{
			rem=num%10;
			dec=dec+rem*base;
			num=num/10;
			base=base*2;
		}
		System.out.println("binary number is:"+bin);
         System.out.println("decimal is:"+dec);
	}


	}