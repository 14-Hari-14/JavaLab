import java.io.*;

class garbage
{
	public static void main(String[] args)
	{
		garbage obj = new garbage();
		obj = null;
		
		garbage obj1 = new garbage();
		garbage obj2 = new garbage();
		obj2 = obj1;
		
		System.gc();
	}
	
	protected void finalize()
	{
		System.out.println("Garbage collection is done");
	}
}
