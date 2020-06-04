package lanqiao;
import java.util.Scanner;
public class ALGO_49 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a[] = new int[101];
	a[0] = 0;
	int num = 0;
	for(int i = 1;i<=n;i++)
	{
	a[i] = sc.nextInt();
	}
	findMax(a,num);
	}
	private static void findMax(int[] a,int num) {
	for(int i=1;i<=a.length-1;i++){
	for (int j = i+1; j <= a.length-1; j++) 
	{
	if(a[i]>=a[j] &&a[i]>a[0])
	{ 
		a[0] = a[i] ;
		num = i;
	}
	else if(a[i]>a[0])
	{
	a[0] = a[j];
	num = j;
	}
	}
	}
	System.out.print(a[0]+" "+(num-1));
	}
	 
	}

