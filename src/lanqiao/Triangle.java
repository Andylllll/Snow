package lanqiao;

import java.util.Scanner;

public class Triangle {
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int[][] a = new int[n + 1][n + 1];

	        for (int i = 1; i <= n; i++)
	            for (int j = 1; j <= i; j++)
	                a[i][j] = s.nextInt();

	        for (int i = n - 1; i > 0; i--)
	            for (int j = 1; j <= i; j++)
	                if (a[i + 1][j] > a[i + 1][j + 1])
	                    a[i][j] += a[i + 1][j];
	                else
	                    a[i][j] += a[i + 1][j + 1];
	        System.out.println(a[1][1]);

	    }

	}


