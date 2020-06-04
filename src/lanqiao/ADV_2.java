package lanqiao;
import java.util.Scanner;

public class ADV_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[101];
 
		for (int i = 1; i <= n; i++)
			a[i] = sc.nextInt();
		int yueshu = a[1];
		for (int i = 2; i <= n; i++) {
			yueshu = yue(yueshu, a[i]);
		}
		if (yueshu != 1) {
			System.out.println("INF");
		} else {
			boolean dp[] = new boolean[10010];
			dp[0] = true;
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j + a[i] <= 10000; j++) {
					if (dp[j]) {
						dp[j + a[i]] = true;
					}
				}
			}
			int sum = 0;
			for (int i = 0; i <= 10000; i++)
				if (dp[i] == false)
					sum++;
			System.out.println(sum);
		}
	}
 
	private static int yue(int x, int y) {
		if (y == 0)
			return x;
		else
			return yue(y, x % y);
	}
}