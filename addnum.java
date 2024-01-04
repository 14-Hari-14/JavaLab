import java.util.*;
public class addnum
{
	public static void main(String[] args)
	{
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first numbers: "); 
		num1 = sc.nextInt();
		System.out.println("Enter second numbers: "); 
		num2 = sc.nextInt();
		num3 = num1+num2;
		System.out.println("The sum of "+num1+" and "+num2+" is: "+ num3);
	}
}
