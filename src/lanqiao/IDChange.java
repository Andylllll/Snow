package lanqiao;

import java.util.Scanner;

public class IDChange {
public static void main(String[] args)
{
	int sum=0;
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	char[] c1={'1','0','x','9','8','7','6','5','4','3','2'};
	int[] c2={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
	char[] s1=s.toCharArray();
	char [] s2=new char[20];
	System.arraycopy(s1, 0, s2, 0, s1.length);
	for(int i=14;i>=6;i--)
	{
		s2[i+2]=s2[i];
	}
	s2[6]='1';
	s2[7]='9';
	for(int i=0;i<=16;i++)
	{
		sum+=(s2[i]-'0')*c2[i];
	}
	sum=sum%11;
	for(int i=0;i<17;i++)
	System.out.print(s2[i]);
	System.out.println(c1[sum]);
}
}
