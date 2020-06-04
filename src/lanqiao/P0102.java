package lanqiao;
import java.util.Scanner;
public class P0102 {
	public static void main(String[] args) 
		{
		Scanner sc = new Scanner(System.in);
		String s =  sc.next();
		System.out.println("Hex: 0x" + s);
		String shi = Long.valueOf(s, 16).toString();        
		long ten = Long.parseLong(shi);
		System.out.println("Decimal: " + ten);
		String eight = Long.toOctalString(ten);
		for(int i = eight.length(); i < 4; i++){
		eight = "0" + eight;
		}
		System.out.println("Octal: " + eight);
		}
	
}
