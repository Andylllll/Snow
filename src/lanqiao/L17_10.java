package lanqiao;

import java.util.Scanner;

public class L17_10 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int a[]=new int[10];
	int sum[]=new int[10];
	int c[]=new int[10];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	sum[0]=a[0];
	int ans=0;
	int m=0;
	for(int i=1;i<n;i++)
	{
		if(a[i]%k==0)
			ans++;
		sum[i]=(sum[i-1]+a[i])%k;
		m+=c[sum[0]];
		c[sum[i]]++;
		
	}
	System.out.println(m+ans+c[0]-1);
	}
}
