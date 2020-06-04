package lanqiao;
import java.util.Scanner;
public class ALGO_91 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String n = sc.next();
			String m = sc.next();
			char[] a = new char[n.length()];
			char[] b = new char[m.length()];
			for (int i = 0; i < n.length(); i++) {
				a[i] = n.charAt(i);
				b[i] = m.charAt(i);
				if ((int) a[i] < 97) {
					a[i] = (char) (a[i] + 32);
				}
				if ((int) b[i] < 97) {
					b[i] = (char) (b[i] + 32);
				}
			}
			int sum1 = 0, sum2 = 0;
			for (int i = 0; i < n.length(); i++) {
				sum1 += a[i];
				sum2 += b[i];
			}
			if (sum1 == sum2) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
	 
		}
	
}
