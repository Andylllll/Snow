package lanqiao;

import java.util.Scanner;
public class L18_6 {
	public static void main(String args[])
		{
			int n;
			int a[],b[],c[],d[],e[];
			long ans=0;
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			a=new int[n];
			b=new int[n];
			c=new int[n];
			d=new int[n];
			e=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			for(int i=0;i<n;i++)
				b[i]=sc.nextInt();
			for(int i=0;i<n;i++)
				c[i]=sc.nextInt();
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					if(a[i]<b[j]) 
					{
						d[i]=j+1;break;
					}
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					if(b[i]<c[j]) 
					{
						e[i]=j+1;break;
					}
			for(int i=0;i<n;i++)
				if(d[i]!=0)
				for(int j=d[i]-1;j<n;j++)
					if(e[j]!=0)
					ans+=n-e[j]+1;
			System.out.println(ans);      
		}
	
}
