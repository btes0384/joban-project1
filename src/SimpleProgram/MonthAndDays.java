package SimpleProgram;

import java.util.Scanner;

public class MonthAndDays {

	public static void main(String[] args) {
		int month,days,x;
		Scanner s=new Scanner(System.in);
		System.out.println("enter tne no of days");
		x=s.nextInt();
		month=x/30;
		days=x%30;
		System.out.println("month are=" +month);
		System.out.println("days are=" +days);
		}
	}


