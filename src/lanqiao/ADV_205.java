package lanqiao;

import java.util.Scanner;

public class ADV_205 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int len= (int) Math.sqrt(100005);
	int[] flag=new int[100005];
	int cnt=0;
	int[] prime=new int[len];
	int[]	dp=new int[100005];
	for(int i=2;i<=len;i++)
	{
		if(flag[i]==0)
		{
			prime[cnt++]=i;
			for(int j=i*i;j<=len;j=j+i)
				flag[j]=1;
		}
	}
	for(int i=1;i<=n;i++)
	{
		for(int j=0;j<cnt;j++)
		{
			if(prime[j]>Math.sqrt(i))
			{
				break;
			}
			if(i%prime[j]==0)
			{
				dp[i]=dp[i]>dp[i-prime[j]*2]+prime[j]?dp[i]:dp[i-prime[j]*2]+prime[j];
			}
		
		}
		
	}
	System.out.println(dp[n]);
	
}
}
