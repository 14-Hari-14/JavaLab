public class AreaCalculator
{
	public static void main(String[] args)
	{
		calculateArea("circle", 5.0);
		calculateArea("rectangle", 8.0, 4.0);
		calculateArea("triangle", 3.0, 4.0);
	}
	
	public static double calculateArea(String shape, double... measurements)
	{
		switch(shape.toLowerCase())
		{
			case "circle":
				if(measurements.length == 1)
				{
					System.out.println("Area of circle is: "+ Math.PI*measurements[0]*measurements[0]);
				}
				else
				{
					System.out.println("Invalid argument sent 1");
				}
				break;
			case "rectangle":
				if(measurements.length == 2)
				{
					System.out.println("Area of rectangle is: "+measurements[0]*measurements[1]);
				}
				else
				{
					System.out.println("Invalid argument sent");
				}
				break;
			case "triangle":
				if(measurements.length == 2)
				{
					System.out.println("Area of triangle is: "+measurements[0]*measurements[1]*0.5);
				}
				else
				{
					System.out.println("Invalid argument sent");
				}
				break;
			default:
				System.out.println("Shape not recognised");
				return -1;
		}
		return 0;
	}
}
