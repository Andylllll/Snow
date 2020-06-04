package lanqiao;
import java.util.Arrays;
import java.util.Scanner;
public class Balloons_in_a_Box {
		public static void main(String []args){
			new Balloons_in_a_Box();
		}
		int total;
		int[] visit;
		int[] result;
		double max;
		Point c1,c2,ps[];
		int count=0;
		public Balloons_in_a_Box(){
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			while(sc.hasNext()){
				total=sc.nextInt();
				c1=new Point(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
				c2=new Point(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
				ps=new Point[total];
				for(int i=0;i<total;i++){
					ps[i]=new Point(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
				}
				visit=new int[total];
				Arrays.fill(visit, 0);
				result=new int[total];
				max=0;
				dfs(0);//全排列total个数,结果放入result中
				double v=Math.abs((c1.x-c2.x)*(c1.y-c2.y)*(c1.z-c2.z));
				System.out.printf("%.0f",v-max);
				System.out.println();
			}
		}
		private void dfs(int count) {
			for(int i=0;i<total;i++){
				if(visit[i]==0){
					visit[i]=1;
					result[count]=i;
					if(count==total-1){
						cal();
					}else{
						dfs(count+1);
					}
					visit[i]=0;
				}
			}
		}
		private void cal() {
			double totalv=0;//所有圆的面积和
			for(int i=0;i<total;i++){
				ps[i].r=0;
			}
			for(int i=0;i<total;i++){
				int now=result[i];
				//到面的最短距离
				double x1=Math.min(Math.abs(ps[now].x-c1.x),Math.abs(ps[now].x-c2.x));
				double x2=Math.min(Math.abs(ps[now].y-c1.y),Math.abs(ps[now].y-c2.y));
				double x3=Math.min(Math.abs(ps[now].z-c1.z),Math.abs(ps[now].z-c2.z));
				ps[now].r=Math.min(x1,Math.min(x2, x3));
				//到其它点的距离
				for(int j=0;j<total;j++){
					if(now==j||ps[j].r==0)continue;
					double x4=Math.sqrt((ps[now].x-ps[j].x)*(ps[now].x-ps[j].x)+(ps[now].y-ps[j].y)*(ps[now].y-ps[j].y)+(ps[now].z-ps[j].z)*(ps[now].z-ps[j].z))-ps[j].r;
					ps[now].r=Math.min(ps[now].r, x4);
					if(ps[now].r<0)ps[now].r=0;
				}
				totalv+=4.0d/3.0d*Math.PI*ps[now].r*ps[now].r*ps[now].r;
			}
			if(totalv>max)max=totalv;
		}
	}
	class Point{
		double x,y,z;//坐标
		double r;//半径
		public Point(double x,double y,double z){
			this.x=x;this.y=y;this.z=z;
		}

}
