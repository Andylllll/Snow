package lanqiao;
import java.util.Scanner;
 
public class ALGO_1 {
	   public static void QuickSort(int a[], int sta, int end) {
	        if (sta < end) {
	            int q = paititon(a, sta, end);
	            QuickSort(a, sta, q - 1);
	            QuickSort(a, q + 1, end);
	        }
	    }
	   public static int paititon(int a[], int sta, int end) {
	        int i = sta, j = end + 1;
	        int temp = a[i];
	        while (true) {
	            while (a[++i] > temp && i < end) ;
	            while (a[--j] < temp) ;
	            if (i >= j) break;
	            swap(a, i, j);
	        }
	        swap(a, sta, j);
	        return j;
	    }
	 
	    public static void swap(int num[], int a, int b) {
	        int temp = num[a];
	        num[a] = num[b];
	        num[b] = temp;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt(); 
	        int[] num = new int[n];
	        for (int i = 0; i < n; i++) {
	            num[i] = scanner.nextInt();
	        }
	        int m = scanner.nextInt();  
	        int[][] req = new int[m][3];
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < 3; j++) {
	                req[i][j] = scanner.nextInt();
	            }
	        }
	        for (int i = 0; i < m; i++) {
	            int[] temp = new int[n];
	            for (int j = 0; j < n; j++) {
	                temp[j] = num[j];
	            }
	            QuickSort(temp, req[i][0] - 1, req[i][1] - 1);
	            System.out.println(temp[req[i][0] - 2 + req[i][2]]);
	        }
	    }
	}

