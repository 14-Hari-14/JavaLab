import java.util.Scanner;

class Shirt
{
	double collarsize;
	double sleevelength;
	String material="Cotton";
	// constructors dont have return types
	public Shirt()
	{
		this.collarsize = 0.0;
		this.sleevelength = 0.0;
		this.material = "Cotton";
	}
	public Shirt(double collarsize, double sleevelength)
	{
		this.collarsize = collarsize;
		this.sleevelength = sleevelength;
		this.material = "Cotton";
	}
	public double getCsize()
	{
		return collarsize;
	}
	public double getSlength()
	{
		return sleevelength;
	}
	public String getMaterial()
	{
		return material;
	}
	
}
public class TestShirt
{
	public static void main(String[] args)
	{
		double csize, slength;
		String mat;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter collar length: ");
		csize = sc.nextDouble();
		System.out.print("Enter sleeve length: ");
		slength = sc.nextDouble();
		Shirt s1 = new Shirt();
		Shirt s2 = new Shirt(16.2, 34.8);
		Shirt s3 = new Shirt(csize, slength);
		System.out.println("Dimensions for shirts are");
		System.out.println("Collar size: "+s1.getCsize()+"\nSleeve length: "+s1.getSlength()+"\nMaterial: "+s1.getMaterial()+"\n");
		System.out.println("Collar size: "+s2.getCsize()+"\nSleeve length: "+s2.getSlength()+"\nMaterial: "+s2.getMaterial()+"\n");
		System.out.println("Collar size: "+s3.getCsize()+"\nSleeve length: "+s3.getSlength()+"\nMaterial: "+s3.getMaterial()+"\n");
	}
}
