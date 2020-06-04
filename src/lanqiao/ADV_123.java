package lanqiao;

import java.util.Scanner;

public class ADV_123 {
public static void main(String[ ] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=sc.nextInt();
int b=sc.nextInt();
int x=sc.nextInt();
double[][] dp=new double[n+1][x+1];
for(int j = a;j <= b;j++)
	if(j<=x)
	{
	    dp[1][j] = 1.0/(b-a+1);
	}

for(int i=2;i<=n;i++)
{
	for(int j=a;j<=b;j++)
	{
		for(int k=a;k<=x;k++)
		{
			if(j<=k)
				dp[i][k]=dp[i][k]+dp[i-1][k-j]*1.0/(b-a+1);
		}
			
	}
}
System.out.printf("%.4f",dp[n][x]);

}
}
