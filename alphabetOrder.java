import java.util.Arrays;
import java.util.Scanner;

public class alphabetOrder
{
	public static void main(String[] args)
	{
		int len,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		len = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[len];
		for(i=0;i<len;i++)
		{
			System.out.print("Enter string: ");
			arr[i] = sc.nextLine();
		}
		System.out.println("Unsorted array: ");
		for (String str : arr) 
		{
            		System.out.print(str+" ");
            	}

		Arrays.sort(arr);
		System.out.println("\n");
		System.out.println("Sorted array: ");
		for (String str : arr) 
		{
            		System.out.print(str+" ");
            	}
            	System.out.println("\n");
	}
}
