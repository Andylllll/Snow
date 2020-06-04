package lanqiao;
import java.util.Scanner;
public class ADV_227 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String s1=sc.nextLine();
			String s2=sc.nextLine();
			char[] A=s1.toCharArray();
			char[] B=s2.toCharArray();
			char m=0,n=0;
			for(int i=0;i<A.length;i++)
				m+=A[i];
			for(int j=0;j<B.length;j++)
				n+=B[j];
			if(m<n)
				System.out.print(-1);
			else if(m==n)
				System.out.println(0);
			else
				System.out.println(1);
			}

	}
