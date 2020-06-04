package lanqiao;

import java.util.Scanner;

public class Matrix_Multiplication {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long[][] m=new long[n+1][n+1];
	int[] p=new int[n+1];
	for(int i=0;i<n+1;i++)
	{
		p[i]=sc.nextInt();
	}
	mul(p,n,m);
	System.out.print(m[1][n]);
}
public static  void mul(int p[], int n, long[][] m)
{
	for(int i=1;i<=n;i++)
	{
		m[i][i]=0;
	}
	for(int l=2;l<=n;l++)
	{
		for(int i=1;i<=n-l+1;i++)
		{
			int j=i+l-1;
			m[i][j]=Long.MAX_VALUE ;
			for(int k=i;k<=j-1;k++)
			{
				long t=m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];
				if(t<m[i][j])
				{
					m[i][j]=t;
				}
			}
		}
	}
}
}
