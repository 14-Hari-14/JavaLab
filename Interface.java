import java.lang.Math;
interface shape
{
	public double getArea();
}
class Rectangle implements shape
{
	private double l;
	private double b;
	public Rectangle(double l, double b)
	{
		this.l = l;
		this.b = b;
	}
	public double getArea()
	{
		return l*b;
	}	
}

class Triangle implements shape
{
	private double h;
	private double b;
	public Triangle(double h, double b)
	{
		this.h = h;
		this.b = b;
	}
	public double getArea()
	{
		return 0.5*h*b;
	}
}

class Circle implements shape
{
	private double r;
	public Circle(double r)
	{
		this.r = r;
	}
	public double getArea()
	{
		return Math.PI*r*r;
	}
}

public class Interface
{
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(10, 20);
		Triangle t1 = new Triangle(3, 4);
		Circle c1 = new Circle(1);
		
		System.out.println("Area of rectangle is: "+r1.getArea());
		System.out.println("Area of triangle is: "+t1.getArea());
		System.out.println("Area of circle is: "+c1.getArea());
	}
}
