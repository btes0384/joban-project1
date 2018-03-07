package ArrayProgram;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		int i,temp,j,n=5;
		Scanner s=new Scanner(System.in);
		int[]arr=new int[n];
		System.out.println("enter all elemnets");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
		for(i=0;i<arr.length;i++)
		{
			System.out.println(+arr[i]);
		}
}

	}