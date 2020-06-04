package lanqiao;
import java.util.Scanner;
public class ALGO_148{
    public static int getGcd(int m,int n){
        while(n > 0){
            int temp = m % n;
            m = n;
            n = temp;
        }
        return m;
    }

    public static int getLcm(int m,int n){
        int gcd = getGcd(m,n);
        int result = m*n / gcd;
        return result;
    }
    
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in );
   		int m=sc.nextInt();
   		int n=sc.nextInt();
        System.out.println(getLcm(m, n));

    }
    
}