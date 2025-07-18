package palindrome_str;
import java.util.*;
public class Palindrome_str {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the  String : ");
		String str=sc.nextLine();
		StringBuilder s=new StringBuilder(str);
		String str1=s.reverse().toString();
		if(str.equals(str1)) {
			System.out.println("The given word is palindrome");
		}
		else {
			System.out.println("The given word is not palindrome");
		}
	}

}
