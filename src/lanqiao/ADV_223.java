package lanqiao;

import java.util.Scanner;

public class ADV_223 {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int x=1;
	boolean flag=true;
	while(n!=1)
	{
		x++;
		while(n%x==0)
		{
			n/=x;
			if(flag) {
				System.out.print(x);
				flag=false;
			}else {
				System.out.print("*"+x);
			}
		}
	}
}
}
