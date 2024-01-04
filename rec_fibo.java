import java.util.Scanner;
class Recursion
{
	public int recursion(int n)
	{
		if(n==1)
		{
			return 0;
		}
		else if(n==2)
		{
			return 1;	
		}
		return recursion(n-2)+recursion(n-1);
		
	}
}
public class rec_fibo
{
	public static void main(String[] args)
	{
		int terms, x1=0;
		Scanner sc = new Scanner(System.in);
		Recursion r1 = new Recursion();
		System.out.print("Enter the number of terms of fibonachi sequence to be displayed: ");
		terms = sc.nextInt();
		for(int i=1; i<=terms; i++)
		{
			x1 =r1.recursion(i);
			System.out.print(x1+" ");
		}
		System.out.println("\n");
	}
}
