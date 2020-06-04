package lanqiao;
import java.util.*;
import java.math.*;
public class K_2 {
	public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	fun(n);
	}
public static void fun(int n)
{
	int m=0;
	int num=0;
	int k=0;
	int vis[]=new int[50];
	while(n>0)
	{
		m=n%2;
		if(m==1)
		vis[k++]=num;//当K在[]内时先+1
		num++;
		n/=2;
	}
	for(int i=k-1;i>=0;i--)
	{
		if(vis[i]==0) System.out.print("2(0)");
		else if(vis[i]==1) System.out.print("2");
		else if(vis[i]==2) System.out.print("2(2)");
		else if(vis[i]>2) {
		System.out.print("2(");
		fun(vis[i]);
		System.out.print(")");
		}
		if(i>0) System.out.print("+");
		}
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	