import java.lang.Math;
class areaCalculator
{
	public double calc(double r)
	{
		return Math.PI*r*r; 
	}
	
	public double calc(double l, double b)
	{
		return l*b;
	}
	public double calc(double h, double b, String shape)
	{
		return 0.5*h*b;
	}
}

public class area
{
	public static void main(String[] args)
	{
		areaCalculator a1 = new areaCalculator();
		
		double circle = a1.calc(7.0);
		System.out.println("Area of circle: "+circle);
		
		double rect = a1.calc(5.0, 4.0);
		System.out.println("Area of rectangle: "+rect);
		
		double tri  = a1.calc(3.0, 4.0, "triangle");
		System.out.println("Area of triangle: "+tri);
		
	}
}
