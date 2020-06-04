package lanqiao;

public class L17_2 {

	 static boolean k[]=new boolean[10];  //判断这个数有没有被取过
	 static int g[]=new int[10];//存放9个数
	 static int count=0;
	 public static void main(String []args)
	 {
		 dfs(1);
		 System.out.println(count);
	 }
	public static void dfs(int m) {
		
		if(m==10)
		{
			if((g[4]*100+g[5]*10+g[6])*1.00/(g[7]*100+g[8]*10+g[9])+g[2]*1.00/g[3]+g[1]==10)
				count++;
		}
		for(int i=1;i<=9;i++)
		{
			if(k[i]==false)
			{
				k[i]=true;
				g[m]=i;
				dfs(m+1);
				k[i]=false;
			}
		}
	}

}
