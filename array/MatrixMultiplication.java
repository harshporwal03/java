import java.util.*;
public class MatrixMultiplication {
	public static void main(String args[]) 
	{
		Scanner in=new Scanner(System.in);
		int i,j,r1,r2,c1,c2,sum=0;
		
		
		System.out.println("enter the rows of matrix 1");
		r1=in.nextInt();
		System.out.println("enter the columns of matrix 1");
		c1=in.nextInt();
		int a[][]=new int[r1][c1];
		
		
		System.out.println("enter the rows of matrix 2");
		r2=in.nextInt();
		System.out.println("enter the columns of matrix 2");
		c2=in.nextInt();
		int b[][]=new int[r2][c2];
		
		if(c1!=r2)
		{
			System.out.println("matrix multiplication is not possible");
		}
		else
		{
			
			int mulmat[][]=new int[r1][c2];
			
		System.out.println("Enter elements of matrix 1");
		for(i=0;i<r1;i++) 
		{
			for(j=0;j<c1;j++)
			 a[i][j]=in.nextInt();
		}
		
		System.out.println("Enter elements of matrix 2");
		for(i=0;i<r2;i++) 
		{
			for(j=0;j<c2;j++)
			 b[i][j]=in.nextInt();
		}
		
		//DISPLAY BOTH THE MATRICES
		System.out.println("the matrix 1 is:");
		for(i=0;i<r1;i++) 
		{
			for(j=0;j<c1;j++)
				System.out.print(a[i][j]+" ");
			System.out.println(" ");
		}
		
		System.out.println("the matrix 2 is:");
		for(i=0;i<r2;i++) 
		{
			for(j=0;j<c2;j++)
				System.out.print(b[i][j]+" ");
			System.out.println(" ");
		}
		
		
		//MATRIX MULTIPLICATION
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				for(int k=0;k<r2;k++)
				{
				sum=sum+a[i][k]*b[k][j];
			    }
				mulmat[i][j]=sum;
				sum=0;
		    }
		}
		
		
		//PRINT THE PRODUCT MATRIX
		System.out.println("The product of both the matrices is :");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
			    System.out.print(mulmat[i][j]+" ");
			}
			System.out.println(" ");
		}
		}
        }
}
