import java.util.*;
public class Transpose {
public static void main (String args[])
{
	Scanner in =new Scanner(System.in);
	int r,c,i,j;
	System.out.println("Enter rows of matrix");
	r=in.nextInt();
	System.out.println("Enter columns of matrix");
	c=in.nextInt();
	int a[][]=new int[r][c];
	System.out.println("Enter elements of matrix");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++) {
			a[i][j]=in.nextInt();
		}
	}
	
	System.out.println("original matrix");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++) {
			System.out.print(+a[i][j] + " ");
		}
		System.out.println();
	}
	System.out.println("tranpose matrix");
	for(i=0;i<c;i++)
	{
		for(j=0;j<r;j++) {
			System.out.print(+a[j][i] + " ");
		}
		System.out.println();
		
    }
}
}
