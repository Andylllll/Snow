package lanqiao;

public class ADV_143 {
	public static void main(String []args)
	{
		int i,sum=0;
		for (i=0;i<5;i++) 
		{

			sum=0;    
			if (i!=0&&i!=4)
			sum++;
			if (i==2||i==4)
			sum++;
			if (i==2||i==3)
			sum++;
			if (i!=1&&i!=2)
			sum++;
			if (i!=4)
			sum++;
			if (sum==2)
			System.out.printf("%c ",'A'+i);
		}
	}
}
