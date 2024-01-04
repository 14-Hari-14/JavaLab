public class practise
{
	int x;
	
	// Default constructor
	public practise()
	{
		x =0; 
	}
	
	// Parameterized constructor
	public practise(int par)
	{
		x = par;
	}
	
	public static void main(String[] args)
	{
		practise pra = new practise();
		practise pra1 = new practise(5);
		System.out.println(pra.x);
		System.out.println(pra1.x);
		
		//practise(5);	
	}
	

}
