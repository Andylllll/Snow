package lanqiao;

import java.util.Scanner;

public class L17_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			}
		
		int yue=a[0];
		for(int i=1;i<n;i++)
		{
			yue=yueshu(yue,a[i]);
		}
		if(yue!=1)
		{
			System.out.print("INF");
		}else
		{
			boolean dp[]=new boolean[10010];
			dp[0]=true;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j+a[i]<=10000;j++)
				{
					if(dp[j])
					{
						dp[j+a[i]]=true;
					}
				}
			}
			int sum=0;
			for(int i=0;i<=10000;i++)
			{
				if(dp[i]==false)
					sum++;
			}	System.out.println(sum);
			}
	
	}

	private static int yueshu(int x, int y) {
		if (y == 0)
			return x;
		else
			return yueshu(y, x % y);
	}
}
