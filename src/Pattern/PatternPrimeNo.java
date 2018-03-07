package Pattern;

public class PatternPrimeNo {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			int count=0;
			for(k=1;k<=i*2;k++)
			{
				boolean isprime=true;
				for(j=2;j<k;j++)
				{
					if(k%j==0)
					{
						isprime=false;
						break;
					}
				}
				if((isprime==true)&&(count<i))
				{
					System.out.print(k);
					count++;
					
				}
			}
			System.out.println();
		}

	}


	}
