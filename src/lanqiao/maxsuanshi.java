package lanqiao;

import java.util.Scanner;

public class maxsuanshi {
public static long getsum(int[] A, int start,int end)
{
	long sum =0;
	for(int i=start;i<=end;i++)
	{
	sum+= A[i];
	}
	return sum;
}

public static long getmax(int[] A, int start, int mul )
{
	if(mul==0)
	return getsum(A,start,A.length-1);
	long max=0;
	for(int i=start;i<A.length-1;i++)
	{
		long maxx=getsum(A,start,i)*getmax(A,i+1,mul-1);
		max=max>maxx?max:maxx;
	}
	return max;
}
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);

	int n=sc.nextInt();
	int k=sc.nextInt();
	int A[]=new int[n];
	for(int i=0;i<n;i++)
	{
		 A[i]=sc.nextInt();
	}
	System.out.println(getmax(A,0,k));
}
}
