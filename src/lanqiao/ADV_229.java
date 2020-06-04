package lanqiao;

import java.util.Scanner;

public class ADV_229 {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n+1];
	a[0]=0;
	for(int i=1;i<=n;i++)
		{
		a[i]=sc.nextInt();
		}
	fun(a,n);
}

public static void fun(int[] a,int n)
{
	int[][] dp=new int[n+1][n+1];
	int[] sum=new int[n+1];
	for(int i=0;i<=n;i++)
	{
        if(i==0)
            sum[i] = a[i];
        else
            sum[i] = sum[i-1] + a[i];
	}
	
	for(int l=2;l<=n;l++ )
	{
		for(int i=1;i<=n-l+1;i++)
		{
			int j; 
			j = i+l-1;
			dp[i][j]=Integer.MAX_VALUE;
			for(int k=i;k<j;k++)
			{
				int t= (dp[i][k]+dp[k+1][j])+(sum[j] - sum[i-1]);
				if(dp[i][j]>t)
					dp[i][j]=t;
			}
		}
			
	}
	System.out.println(dp[1][n]);
}
}
