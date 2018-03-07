package ArrayProgram;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		int i,n=5,temp,j;
		int []a=new int[n];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the element ");
		for(i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("After sorting ");
		for(i=1;i<a.length;i++)
		{
		j=i;
		while(j>0)
		{
			if(a[j-1]>a[j])
			{
				temp=a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
			}
			else
			{
				break;
			}
			j--;
			
		}

		}
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}


	}