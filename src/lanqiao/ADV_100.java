package lanqiao;
import java.util.*;
public class ADV_100 {
	public static void main(String[] agrs)
		{
			Scanner sc=new Scanner(System.in);
			int[] a=new int[20];
			int result=0;
			int i;
			int[] b=new int[20];
			for(i=0;i<20;i++)
			{
				a[i]=sc.nextInt();
				if(a[i]==0)
					break;
			}
			sc.close();
			for(int j=0;j<i;j++)
			{
				for(int k=0;k<i-1;k++)
				{
					if(a[k]<a[k+1])
					{
						int temp=a[k];
						a[k]=a[k+1];
						a[k+1]=temp;
					}
				}
			}
			System.out.println(a[1]);
		}
	
}
