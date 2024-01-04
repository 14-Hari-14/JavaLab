class Animals
{
	public void sound()
	{
		System.out.println("The animal makes a sound");
	}
}
class Pig extends Animals
{
	public void sound()
	{
		System.out.println("Oinks");
	}
}
class Dog extends Animals
{
	public void sound()
	{
		System.out.println("Barks");
	}
}

public class polymorphism
{
	public static void main(String[] args)
	{
		Animals a1 = new Animals();
		Pig p1 = new Pig();
		Dog d1 = new Dog();
		
		a1.sound();
		p1.sound();
		d1.sound();
	}
}
