package lanqiao;
import java.util.Scanner;
public class ADV_237 {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int L = s.nextInt();
			int R = s.nextInt();
			int sum = 0, k = 0;
			for (int a = 0; a < 3; a++) {
				for (int b = 0; b < 3; b++) {
					for (int c = 0; c < 3; c++) {
						for (int d = 0; d < 3; d++) {
							for (int e = 0; e < 3; e++) {
								for (int f = 0; f < 3; f++) {
									sum = a + b + c + d + e + f;
									if ((sum >= L && sum <= R) || (sum == 2)
											|| (sum == 3) || (sum == 5)
											|| (sum == 7) || (sum == 11))
										k++;
								}
							}
						}
					}
				}
			}
			System.out.println(k);
		}
	
}
