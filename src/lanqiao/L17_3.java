package lanqiao;

import java.util.Scanner;

public class L17_3 {
public static void main(String []args)
{
	double a[][]=new double[30][30];
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<29;i++)
	{
		for(int j=0;j<=i;j++)
		{
			a[i][j]=sc.nextLong();
			}
	}
	for(int i=1;i<30;i++)
	{
		for(int j=0;j<=i;j++)
		{
			if(j!=0)
				a[i][j]=(a[i-1][j]/2.0+a[i-1][j-1]/2.0+a[i][j]);
			else 
				a[i][j]+=a[i-1][j]/2.0;
			}
	}
	double max=0;
	double min=100000;
for(int i=0;i<30;i++)
{
max=Math.max(max,a[29][i]);
min=Math.min(min,a[29][i]);
}
System.out.println(max);
System.out.println(min);
System.out.println((long)(2086458231*max/min));
}
}
