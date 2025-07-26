
//Convert a string to title case (capitalize first letter of each word)

package pack1;
import java.util.*;
public class Capitalize_FstletterOfEachWord {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentences");
		String s=sc.nextLine();
		s=s.toLowerCase();
		String str[]=s.split(" ");
		String s1="";
		for(String i:str) {
			char ch=Character.toUpperCase(i.charAt(0));
			String rest=i.substring(1);
			s1=s1.concat(String.valueOf(ch)).concat(rest).concat(" ");
			
		}
		System.out.println("After Title Case : "+s1.trim());
	}

}
