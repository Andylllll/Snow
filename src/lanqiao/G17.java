package lanqiao;

import java.util.HashSet;
import java.util.Set;

public class G17 {
public static void main(String[] args)
{
	long max=0;
	for(int i=30000;i<100000;i++)
	{
		if(f(i*i))
		{
			if(i*i>max)
			{
				max=i*i;
			}
		}
	}
	System.out.println(max);
}

private static boolean f(int x) {
	Set<Integer> set=new HashSet<Integer>();
	int m=0;
	while(x!=0)
	{
		m=x%10;
		set.add(m);
		x=x/10;
	}
	if(set.size()==10)
	{
		return true;
	}
	else {
	return false;
	}
}
}
