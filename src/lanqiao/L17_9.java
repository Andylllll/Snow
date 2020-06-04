package lanqiao;

import java.util.Scanner;

public class L17_9  {
	static int n;
	static int k;
	static int h[]=new int[10000];
	static int w[]=new int[10000];
  public static void main(String []args)
  {
	  Scanner sc=new Scanner(System.in );
	  n=sc.nextInt();
	  k=sc.nextInt();
	  for(int i=0;i<n;i++)
	  {
		  h[i]=sc.nextInt();
		  w[i]=sc.nextInt();	  
	  }
	  int low=0, high=100000;
	  while(low<high-1)
	  {
		  int mid=(low+high)/2;
		  if(ok(mid))
		  {
			  low=mid;
		  }else
			  high=mid;
	  }
	  System.out.println(low);
	  
  }

private static boolean ok(int m) {
	int v=0;
	for(int i=0;i<n;i++)
	{
		v+=(h[i]/m)*(w[i]/m);
	}
	if(v>=k)
		return true;
	else
	return false;
}
}

