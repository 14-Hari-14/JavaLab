import java.util.*;
public class matmult
{	
	
	static void multiplication(int[][] mat1, int[][] mat2, int len, int rows, int col)
	{
		int i,j;
		int[][] arr3 = new int[rows][col];
		for(i=0;i<len;i++)
		{
			for(j=0;j<len;j++)
			{
				arr3[i][j]=0;
				for(int k = 0; k<len;k++)
				{
					arr3[i][j] += mat1[i][k]*mat2[k][j];
					System.out.println(arr3[i][j]);
				}
				System.out.println("\n");
			}
		}
		System.out.println("The resulting matrix is: ");
		for(i=0;i<len;i++)
		{
			for(j=0;j<len;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int r1,r2,c1,c2,i,j;
		
		
		System.out.println("Enter the number of rows for matrix1: ");
		r1=sc.nextInt();
		
		System.out.println("Enter the number of columns for matrix1: ");
		c1=sc.nextInt();
		
		System.out.println("Enter the number of rows for matrix2: ");
		r2=sc.nextInt();
		
		System.out.println("Enter the number of columns for matrix2: ");
		c2=sc.nextInt();
		
		int[][] arr1 = new int[r1][c1];
		int[][] arr2 = new int[r2][c2];
		
		for(i = 0; i<r1; i++)
		{
			for(j = 0; j<c1; j++)
			{
				System.out.print("Enter element for matrix1: ");
				arr1[i][j] = sc.nextInt();
			}
		}
		
		for(i = 0; i<r2; i++)
		{
			for(j = 0; j<c2; j++)
			{
				System.out.print("Enter element for matrix2: ");
				arr2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("First matrix: ");
		for(i = 0; i<r1; i++)
		{
			for(j = 0; j<c1; j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println("\n");
		}
		
		System.out.println("Second matrix: ");
		for(i = 0; i<r2; i++)
		{
			for(j = 0; j<c2; j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println("\n");
		}
		System.out.println("For multiplication to be possible we need the columns of matrix 1 to match with rows of matrix 2");
		if(c1==r2)
		{
			System.out.println("Matrix multiplication is possible");
			multiplication(arr1, arr2, c1, r1, c2);
		}
		
	}
}
