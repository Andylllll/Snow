package lanqiao;
import java.util.*;  
public class ALGO_51 {
		public static boolean IsPrime(int n)
		{
			if(n==2)
				return true;
			for(int i=2;i<=Math.sqrt(n);i++)
			{
				if(n%i==0)
					return false;
			}
			return true;
		}
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int mul=1;
			int n=sc.nextInt();
			int num,i;
			for(num=2,i=0;i<n;num++)
			{
				if(IsPrime(num)==true)
				{
					mul*=num%50000;
					mul=mul%50000;
					i++;
				}
			}
			System.out.println(mul);
		}
	
}
