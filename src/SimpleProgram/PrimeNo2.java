package SimpleProgram;

public class PrimeNo2 {

	public static void main(String[] args) {
		boolean flag=true;
		for(int i=1;i<=100;i++)
		{
			flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println(i);
			}
		}

	}

}
