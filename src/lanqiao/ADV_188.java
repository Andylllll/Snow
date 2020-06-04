package lanqiao;
import java.util.Scanner;
public class ADV_188 {
		private static int[] arr = new int[10];
		private static boolean[] hasVisited = new boolean[10];
		private static int n;
		private static int count=0;
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			n = scanner.nextInt();
			dfs(0);
		}
		
		private static void dfs(int pos) {
			if(pos==10){
				count++;
				if(count==n){
					for(int i=0;i<10;i++){
						System.out.print(arr[i]);
					}
				}
			}
			for(int i=0;i<=9;i++){
				if(!hasVisited[i]){
					arr[pos]=i;
					hasVisited[i]=true;
					dfs(pos+1);
					hasVisited[i]=false;
				}
			}
		}
		
	
}
