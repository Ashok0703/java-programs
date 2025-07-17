package palindrome_str;
import java .util.*;
public class Palindrome_String {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ;");
		String s=sc.nextLine();
		String str="";
		boolean ispalindrome=true;
		for(int i=s.length()-1;i>=0;i--) {
			str+=s.charAt(i);
		}
		if(s.equals(str)) {
			System.out.println("The given String is palindrome");
		}
		else 
		{
			System.out.println("The given String is not palindrome");
		}
		}
}
