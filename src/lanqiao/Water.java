package lanqiao;
import java.util.Scanner;

	public class Water{
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			double n = s.nextDouble();
			double y = n * 950 / (Math.pow(10, -23) * 3);
			int a = 0;
			while (y > 10) {
				y /= 10;
				a++;
			}
			System.out.printf("%.6f", y);
			System.out.print("E+0");
			if (a == 0)
				System.out.println("0" + a);
			else
				System.out.println(a);
		}
	}
