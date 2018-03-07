package SimpleProgram;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		int n;
		Scanner s= new Scanner (System.in);
		System.out.println("enter any no for table");
		n=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}


	}

}
