package lanqiao;

import java.util.Scanner;

public class L15_8 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in );
		int n=sc.nextInt();
		int m=n;
		int p=0;
		while(m>=3)
		{
			p=m%3;
			m=m/3;			
			
			n=n+m;
			m=m+p;
		}
	
		System.out.print(n);
	}
}
