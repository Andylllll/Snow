package lanqiao;

import java.util.Scanner;

public class ADV_224 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = new int[9];
		for (int i = 0; i < 9; i++) {
			a[i] = s.nextInt();
		}
		int sum1, sum2, sum3, sum4, sum5, sum6, sum7, sum8;
		sum1 = a[0] + a[1] + a[2];
		sum2 = a[3] + a[4] + a[5];
		sum3 = a[6] + a[7] + a[8];
		sum4 = a[0] + a[3] + a[6];
		sum5 = a[1] + a[4] + a[7];
		sum6 = a[2] + a[5] + a[8];
		sum7 = a[0] + a[4] + a[8];
		sum8 = a[2] + a[4] + a[6];
		if (sum1 == sum2 && sum1 == sum3 && sum1 == sum4 && sum1 == sum5
				&& sum1 == sum6 && sum1 == sum7 && sum1 == sum8)
			System.out.print(1);
		else
			System.out.print(0);

}
}