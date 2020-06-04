package lanqiao;

import java.util.Scanner;

public class GlenbowMuseum {
	public static long c(int m,int n)
	{
	    if(m > n/2)
	     m=n-m;
		int a=1;
		int b=1;
		for(int i=1;i<=m;i++)
		{
			a*=n;
			n--;
			b*=i;
		}
		return a/b;
	}
	
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);	
	
	int j=0;
	long sum;
	long a[]=new long[100];
	while(sc.hasNext())
	{
		int n=sc.nextInt();
		if(n==0)
			break;
		else if(n<4||n%2!=0)
            sum=0;
        else if(n==4)
        	  sum=1;
         else
        { 
         sum=c(4,(n+2)/2)+c(4,(n+4)/2);
        } 
        a[j]=sum;
		j++;
	}
	for(int i=0;i<j;i++)
	{
		 System.out.println("Case "+(i+1)+": "+a[i]);
	}
       
}
}
