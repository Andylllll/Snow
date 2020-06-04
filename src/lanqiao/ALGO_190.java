package lanqiao;

import java.util.Scanner;

public class ALGO_190 {
public static void main(String[] args)
{
	long p=1;
	Scanner sc=new Scanner(System.in);
	long n=sc.nextInt();
	for(long i=2;i<=n;i++)
	{
		if(n%i==0&&isprime(i))
		{
			p*=i;
			while(n%i==0)
			{
				n=n/i;
			}
		}
	}
	System.out.print(p);
		}

private static boolean isprime(long n) {
	// TODO 自动生成的方法存根
	for(long i=2;i<=Math.sqrt(n);i++)
	{
		if(n%i==0)
			return false;
	}
	return true;
}
}
