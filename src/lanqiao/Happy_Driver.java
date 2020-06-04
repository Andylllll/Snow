package lanqiao;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Happy_Driver {
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		double[][] g=new double[10000][3];
		int n=sc.nextInt();
		int w=sc.nextInt();
		double x=0,y=0,z=0,t,m;
		t=0;
		m=0;
		for(int i=0;i<n;i++)
	{
		g[i][0]=sc.nextInt();
		g[i][1]=sc.nextInt();
		g[i][2]=(double)g[i][1]/(double)g[i][0];
	}
		for(int i=0;i<n-1;i++)
		{	
			for(int j=i+1;j<n;j++)
		{
			if(g[i][2]<g[j][2])
			{
			 x=g[i][0];
			 y=g[i][1];
			 z=g[i][2];
			 g[i][0]=g[j][0];
			 g[i][1]=g[j][1];
			 g[i][2]=g[j][2];
			 g[j][0]=x;
			 g[j][1]=y;
			 g[j][2]=z;
		}
		}
			
			if(g[i][0]<((double)w-t))
			{
				m+=g[i][1];
				t+=g[i][0];
			}else if(((double)w-t)<=0)
			{
				break;
			}else {
				m=m+g[i][2]*((double)w-t);
				break;
			}
		}
		System.out.println(new DecimalFormat("0.0").format(m));
	}
	}



