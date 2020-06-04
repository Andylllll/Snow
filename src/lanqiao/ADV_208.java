package lanqiao;
import java.util.Scanner;

public class ADV_208 {
	    public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
	        int m1=sc.nextInt();
	        int n1=sc.nextInt();
	        int a[][]=new int[m1][n1];
	        for(int i=0;i<m1;i++){
	            for(int j=0;j<n1;j++){
	                a[i][j]=sc.nextInt();
	            }
	        }
	        int m2=sc.nextInt();
	        int n2=sc.nextInt();
	        int b[][]=new int[m2][n2];
	        for(int i=0;i<m2;i++){
	            for(int j=0;j<n2;j++){
	                b[i][j]=sc.nextInt();
	            }
	        }
	        matrixMul(a,b);
	    }
	    public static void matrixMul(int a[][],int b[][]){
	        int m=a.length;
	        int n=b[0].length;
	        int res[][]=new int[m][n];
	        int sum=0;      
	        for(int i=0;i<m;i++){
	            for(int k=0;k<n;k++){ 
	                for(int j=0;j<b.length;j++){
	                    sum+=a[i][j]*b[j][k];
	                }
	                res[i][k]=sum;
	                sum=0;      
	            }       
	        }   
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                System.out.print(res[i][j]+" ");
	            }
	            System.out.println();
	        }
	    }
	    }  

