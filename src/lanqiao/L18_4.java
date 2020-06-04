package lanqiao;

public class L18_4 {
	public static void main(String[] args) {

		 int[][] dp=new int[4][1010];
			for(int i=1;i<=3;i++)
			{
				for(int j=1;j<=1000;j++)
					dp[i][j]=j;  //i部手机在j层摔坏的最坏次数为j次 
			}
		for(int i=2;i<=3;i++)
		{
		for(int j=1;j<=1000;j++)
		{
			for(int k=1;k<j;k++)  
				dp[i][j]=min(dp[i][j],max(dp[i-1][k-1],dp[i][j-k])+1);
		}
		}
		System.out.print(dp[3][1000]);
	} 

	

	private static int min(int i, int j) {

		return i<=j?i:j;
	}

	private static int max(int i, int j) {
	
		return i>=j?i:j;
	}

	
}
