package lanqiao;
import java.util.Scanner;
public class ADV_226 {
	public static char Getchar(String A){
		char result = 0;
		
		 if(A.equals("*-"))
             result = 'a';
     else if(A.equals("-***"))
         result = 'b';
     else if(A.equals("-*-*"))
         result = 'c';
     else if(A.equals("-**"))
         result = 'd';
     else if(A.equals("*"))
         result = 'e';
     else if(A.equals("**-*"))
         result = 'f';
     else if(A.equals("--*"))
         result = 'g';
     else if(A.equals("****"))
         result = 'h';
     else if(A.equals("**"))
         result = 'i';
     else if(A.equals("*---"))
         result = 'j';
     else if(A.equals("-*-"))
         result = 'k';
     else if(A.equals("*-**"))
         result = 'l';
     else if(A.equals("--"))
         result = 'm';
     else if(A.equals("-*"))
         result = 'n';
     else if(A.equals("---"))
         result = 'o';
     else if(A.equals("*--*"))
         result = 'p';
     else if(A.equals("--*-"))
         result = 'q';
     else if(A.equals("*-*"))
         result = 'r';
     else if(A.equals("***"))
         result = 's';
     else if(A.equals("-"))
         result = 't';
     else if(A.equals("**-"))
         result = 'u';
     else if(A.equals("***-"))
         result = 'v';
     else if(A.equals("*--"))
         result = 'w';
     else if(A.equals("-**-"))
         result = 'x';
     else if(A.equals("-*--"))
         result = 'y';
     else if(A.equals("--**"))
         result = 'z';
		return result;
	}
	
	public static void Getsentence(String ch){
		String str1;
		StringBuilder[] str = new StringBuilder[1000];
		int j=0,count = 0;
		str[j] = new StringBuilder();       
		for(int i=0;i<ch.length();i++){
			if(ch.charAt(i)=='|'){
				j++;
				str[j] = new StringBuilder();   
				count=j;
				
			}
			else{
				
				String str2 = String.valueOf(ch.charAt(i));  
				str[j].append(str2);
			}
				
		}
		for(int k=0;k<=count;k++){
			str1 = str[k].toString(); 
			char temp = Getchar(str1);
			System.out.print(temp);
		}
		
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String ch = sc.nextLine();
		Getsentence(ch);
	}
}
