package lanqiao;

import java.util.Scanner;

public class WeiMing_Lake {

		public static int fun(int m,int n){
			if(n==0)
			{return 1;}  
			else if(m<n)
			{return 0;} 
			else{
				return fun(m-1,n)+fun(m,n-1);   
			}
		}
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			int m = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(fun(m,n));
		}
}
