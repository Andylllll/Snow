package lanqiao;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class ccc{
	public int x,y;
	public String s;
}
public class L {
	
	 static Queue<ccc> q=new LinkedList<ccc>();
		static ccc Start=new ccc();
		static ccc End=new ccc();
		static ccc Next=new ccc();
		static ccc Top=new ccc();
	static boolean[][] vis=new boolean[30][50];
	static char[][]	map=new char[30][50];
	static int[] dx= {1,0,0,-1};
	static int[] dy= {0,-1,1,0};
	static char[] dir= {'D','L','R','U'};
	static int N=4,M=6;

	 
	public static boolean  judge(int x,int y){
		if(x<0||x>=N||y<0||y>=M) return false;//越界
		if(map[x][y]=='1'||vis[x][y]==true) return false;//是障碍或走过了
		return true;
	}
	 
	public static void BFS(){
	
		q.add(Start);
		while(!q.isEmpty()){
			Top=q.peek();
			q.poll();
			for(int i=0;i<4;i++){
				int x=Top.x+dx[i];
				int y=Top.y+dy[i];
				if(judge(x,y)){
					vis[x][y]=true;//走过了
					Next.x=x;Next.y=y;
					Next.s=Top.s+dir[i];
					if(Next.x==End.x&&Next.y==End.y){//到出口了
						//输出轨迹方向
						
							System.out.println(Next.s);
					
				
						return;
					}else{
						q.add(Next);
					}
	 
				}
			}
		}
		return;
	}
	 
	public static void main(){
		Scanner sc=new Scanner(System.in);
		 for(int i=0;i<N;i++) {
		        String string = sc.next();
		        for(int j=0;j<M;j++)
		            map[i][j] = string.charAt(j);
		        
		    }
		
		Start.x=0;Start.y=0;
		End.x=N-1;End.y=M-1;
		BFS();
		
	}
	
}
