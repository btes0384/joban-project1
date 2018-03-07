package SimpleProgram;
import java.util.Scanner;
public class WhileLoop2 {

	public static void main(String[] args) {
		int x=1,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the last number you need to enter");
		n=s.nextInt();
		while(x<=n)
		{
			System.out.println(x);
			x++;
		}

	}

}
