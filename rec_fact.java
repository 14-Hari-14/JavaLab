import java.util.Scanner;
class Recursion
{
	public int recursion_factorial(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		if(n == 1)
		{
			return 1;
		}
		return n*recursion_factorial(n-1);
	}
}
public class rec_fact
{
	public static void main(String[] args)
	{
		int num;		
		Scanner sc = new Scanner(System.in);
		Recursion rc = new Recursion();
		System.out.println("Enter the number whose factorial is to be found: ");
		num = sc.nextInt();
		int result = rc.recursion_factorial(num);
		System.out.println("Result: "+result);
	}
}
