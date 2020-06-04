package lanqiao;

import java.util.Scanner;

public class ADV_222 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	double x=sc.nextDouble();    	
    	double m=0,n=Math.PI;
    	double temp;
    	double result=(m+n)/2;
    	double s=Math.cos(result)-x;
    	 while(Math.abs(s) > 1e-15) {
    		 result=(m+n)/2;
              temp = Math.cos(result);
              if(temp - x > 0) {  
                  m = result;
              } else {
                  n = result;
              }
              s = Math.cos(result) - x;
        
          }
          System.out.printf("%.5f", result);
    }
}
