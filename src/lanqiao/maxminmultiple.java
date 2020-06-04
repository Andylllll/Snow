package lanqiao;

import java.util.Scanner;

public class maxminmultiple {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long r1=n*(n-1)*(n-2);
	long r2=(n-1)*(n-2)*(n-3);
	long r3=n*(n-1)*(n-3);
	if(n==1)
		System.out.println(1);
	else {
		
		if(n==2)
			System.out.println(2);
		else
		{
			if(n%2!=0)
				System.out.println(r1);
			else
			{
				if(n%3!=0)
					System.out.println(r2);
				else
					System.out.println(r3);
				
			}
		}
	}
}
}
