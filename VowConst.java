import java.util.Scanner;
class Count
{
	public int count(String input)
	{
		int count=0;
		for(int i = 0; i<input.length(); i++)
		{
			char ch = input.charAt(i);
			if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count = count + 1;
			}
		}
		return count;
	}
}
public class VowConst
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String inputString;
		System.out.print("Enter a string: ");
		inputString = sc.nextLine();
		inputString.toLowerCase();
		Count c = new Count();
		int vowels = c.count(inputString);
		System.out.println("Vowels: "+ vowels);
		System.out.println("Consonants: "+ (inputString.length()-vowels));
		
	}
}
