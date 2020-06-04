package lanqiao;
import java.util.Scanner;
public class ALGO_92 {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String mm = sc.next();
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        if (mm.equals("+")) {
	            System.out.println(a+b);
	        }else if (mm.equals("-")) {
	            System.out.println(a-b);
	        }else if (mm.equals("*")) {
	            System.out.println(a*b);
	        }else if (mm.equals("/")) {
	            System.out.println(a/b);
	        }
	    }
	}

