package lanqiao;
import java.util.Scanner;
public class ALGO_142 {
	    public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       char s = sc.next().charAt(0);
	       double a = sc.nextDouble();
	       double b = sc.nextDouble();
	       double c = sc.nextDouble();
	       double d = sc.nextDouble();
	       if(s=='+'){
	    	   System.out.printf("%.2f+%.2fi",a+c,b+d);
	       }
	       if(s=='-'){
	    	   System.out.printf("%.2f+%.2fi",a-c,b-d);
	       }
	       if(s=='*'){
	    	   System.out.printf("%.2f+%.2fi",(a*c-b*d),(a*d+b*c));
	       }
	       if(s=='/'){
	    	   System.out.printf("%.2f+%.2fi",(a*c+b*d)/(c*c+d*d),(b*c-a*d)/(c*c+d*d));
	       }
	       
	 
	    }
	 
	}

