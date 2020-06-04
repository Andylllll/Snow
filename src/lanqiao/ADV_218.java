package lanqiao;

import java.util.Scanner;

public class ADV_218 {
public static void main(String []args)
{
	
	Scanner sc=new Scanner(System.in);
	Long n=sc.nextLong();
	print(n);
}

private static void print(Long n) {
	// TODO 自动生成的方法存根
	long[][] s= {{6,5,1,4,2,3,3,5}};
	if(n==1)
		System.out.println(2+"\n"+3);
	else if(n==2)
		System.out.println(1+"\n"+4);
	else if(n==3)
		System.out.println(6+"\n"+5);
	else
	{
		long[][] B=get(n-3);
		s=mul(s,B);
		System.out.print(s[0][0]+"\n"+s[0][1]);
	}
	}

private static long[][] mul(long[][] s, long[][] b) {
	long r[][] = new long[s.length][b[0].length];
	for(int i=0;i<s.length;i++)
	{
		for(int j=0;j<b[0].length;j++)
		{
			for(int k=0;k<s[0].length;k++)
				r[i][j]=(r[i][j]+s[i][k]*b[k][j])%99999999;
				
		}
	}
	return r;
}

private static long[][] get(long n) {
	// TODO 自动生成的方法存根
	 long[][] A = {{0,1,1,0,0,0,0,0},
		        {1,0,0,1,0,0,0,0},
		        {0,0,0,0,1,0,0,0},
		        {0,0,0,0,0,1,0,0},
		        {2,3,0,0,0,0,0,0},
		        {0,2,0,0,0,0,0,0},
		        {0,1,0,0,0,0,1,0},
		        {1,0,0,0,0,0,0,1}}; 
	long[][] zero=new long[8][8];
	long[][] m=new long[8][8];
	if(n==0)
		return zero;
	if(n==1)
		return A;
	if((n&1)==0)
	{
		m=get(n>>1);
		return mul(m,m);
	}
	m=get((n-1)>>1);
	return mul(mul(m,m),A);
	}
	}
