package lanqiao;

import java.util.Scanner;

public class ALGO_3 {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
	int l=sc.nextInt();
	int dp[][]=new int[l+1][k+1];
	for(int i=0;i<k;i++)
	{
		dp[1][i]=1;	
	}
	for(int i=2;i<=l;i++)
	{
		for(int j=0;j<k;j++)
		{
			for(int x=0;x<k;x++)
				if(x!=j+1&&x!=j-1)
				{
					dp[i][j]=(dp[i][j]+dp[i-1][x])%1000000007;
				}
				
		}
	}
	long sum=0;
	for(int i=1;i<k;i++)
	{
		sum=(sum+dp[l][i])%1000000007;
	}
	System.out.println(sum);
}
}