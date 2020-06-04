package lanqiao;
import java.util.Scanner;
public class  ALGO_90 {
	public static void main(String[] args){
		int i,j;
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		int[] count=new int[n];
		if(n>0)
		{
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		}
		in.close();
		for(i=0;i<n;i++)
		{
			for(j=i;j<n-1;j++)
			{
				if(a[i]==a[j+1])
				{
					count[i]++;
				}
			}
		}
		int max=count[0];
		int maxx=a[0];
		for(i=0;i<n;i++)
		{
			if(count[i]>max)
			{
				max=count[i];
				maxx=a[i];
			}	
		}
		System.out.println(maxx);
	}
}
