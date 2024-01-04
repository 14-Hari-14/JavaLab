import java.util.Scanner;

class Rectangle
{
	private double length;
	private double breadth;
	public Rectangle()
	{
		this.length = 0.0;
		this.breadth = 0.0;
	}
	public Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public double calcPerimeter()
	{
		double perimeter = 2*(length + breadth);
		return perimeter;
	}
}
public class perimeter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double l, b;
		
		System.out.print("Enter the length of rectangle: ");
		l = sc.nextDouble();
		System.out.print("Enter the breadth of rectangle: ");
		b = sc.nextDouble();
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(l, b);
		
		System.out.println("\n");
		
		System.out.println("Default constructor");
		double peri1 = r1.calcPerimeter();
		System.out.println("Perimeter default: "+ peri1);
		
		System.out.println("\n");
		
		System.out.println("Parameterized constructor");
		double peri2 = r2.calcPerimeter();
		System.out.println("Perimeter parameterized: "+ peri2);
	}
}
