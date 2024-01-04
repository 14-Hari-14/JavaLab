import java.util.*;
import java.lang.Math;
public class hypotenuse
{
	public static void main(String[] args)
	{
		int base, height;
		double hypotenuse;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base of the triangle: ");
		base = sc.nextInt();
		System.out.print("Enter the height of the triangle: ");
		height = sc.nextInt();
		
		hypotenuse = Math.sqrt(base*base+height*height);
		System.out.println("The hypotenuse of a triangle with base "+base+" and with height "+height+" = "+hypotenuse);
	}
}
