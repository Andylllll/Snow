package lanqiao;
import java.util.Scanner;
public class ADV_230 {
	public static double[] getABC(double[][] point) {
	        double[] edge = new double[3];
	        double x1 = point[0][0], y1 = point[0][1];
	        double x2 = point[1][0], y2 = point[1][1];
	        double x3 = point[2][0], y3 = point[2][1];
	        edge[0] = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
	        edge[0] = Math.sqrt(edge[0]);
	        edge[1] = (x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3);
	        edge[1] = Math.sqrt(edge[1]);
	        edge[2] = (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3);
	        edge[2] = Math.sqrt(edge[2]);
	        return edge;
	    }
	    
	    //计算三角形的周长
	    public static double getL(double[][] point) {
	        double[] edge = getABC(point);
	        return edge[0] + edge[1] + edge[2];
	    }

	    public static double getS(double[][] point) {
	        double[] edge = getABC(point);
	        double p = (edge[0] + edge[1] + edge[2]) / 2;
	        double S = p * (p - edge[0]) * (p - edge[1]) * (p - edge[2]);  //海伦公式
	        S = Math.sqrt(S);
	        return S;
	    }

	    public static double[] getExcenter(double[][] point) {
	        double[] center = new double[2];
	        double x1 = point[0][0], y1 = point[0][1];
	        double x2 = point[1][0], y2 = point[1][1];
	        double x3 = point[2][0], y3 = point[2][1];
	        double a , b , c , d ;
	           a = (x1*x1 + y1*y1 - x2*x2 - y2*y2) * (x1 - x3) / 2;
	           b = (x1*x1 + y1*y1 - x3*x3 - y3* y3) * (x1 - x2) / 2;
	           c = (y1 - y2) * (x1 - x3);
	           d = (y1 - y3) * (x1 - x2);
	        center[1] = (a - b) / (c - d); 
	        double e, f;
	        if(x1 != x2) { 
	            e = (x1*x1 + y1*y1 - x2*x2 - y2*y2) / (2 * (x1 - x2));
	            f = (y1 - y2) / (x1 - x2);
	            center[0] = e - f * center[1];  
	        } else if(x1 != x3) {
	            e = (x1*x1 + y1*y1 - x3*x3 - y3*y3) / (2 * (x1 - x3));
	            f = (y1 - y3) / (x1 - x3);
	            center[0] = e - f * center[1];
	        } else if(x2 != x3) {
	            e = (x2*x2 + y2*y2 - x3*x3 - y3*y3) / (2 * (x2 - x3));
	            f = (y2 - y3) / (x2 - x3);
	            center[0] = e - f * center[1];
	        }
	        return center;  
	    }

	    public static double[] getBarycenter(double[][] point) {
	        double[] center = new double[2];
	        double x1 = point[0][0], y1 = point[0][1];
	        double x2 = point[1][0], y2 = point[1][1];
	        double x3 = point[2][0], y3 = point[2][1];
	        center[0] = (x1 + x2 + x3) / 3; 
	        center[1] = (y1 + y2 + y3) / 3; 
	        return center;
	    }

	    public static void printResult(double[][] point) {
	        double L = getL(point);
	        double S = getS(point);
	        double[] exCenter = getExcenter(point);
	        double[] baryCenter = getBarycenter(point);
	        System.out.printf("%.2f\n",L);
	        System.out.printf("%.2f\n",S);
	        System.out.printf("%.2f",exCenter[0]);
	        System.out.printf(" %.2f\n",exCenter[1]);
	        System.out.printf("%.2f",baryCenter[0]);
	        System.out.printf(" %.2f\n",baryCenter[1]);
	        
	    }
	    
	    public static void main(String[] args) {
	
	        Scanner in = new Scanner(System.in);
	        double[][] point = new double[3][2];
	        for(int i = 0;i < 3;i++) {
	            point[i][0] = in.nextDouble();
	            point[i][1] = in.nextDouble();
	        }
	        printResult(point);
	    }
	}

