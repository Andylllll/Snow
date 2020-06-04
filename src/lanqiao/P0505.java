package lanqiao;

import java.math.BigDecimal;
import java.util.Scanner;

public class P0505 {
public static void main(String []args)
{
	BigDecimal s=BigDecimal.ONE;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
{
	 s = s.multiply(BigDecimal.valueOf(i));
}
	String s1=s.toString();
	for(int j=s1.length()-1;j>0;j--)
	{
		if(s1.charAt(j)!='0')
		{
			System.out.println(s1.charAt(j));
			return;
		}
			
	}

}
}
