package pack1;
import java.util.*;
public class Remove_Dublicate_Char {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1=sc.nextLine();
		StringBuilder s2=new StringBuilder();
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(s2.indexOf(String.valueOf(ch))==-1) {
				s2.append(ch);
			}
		}
		System.out.println("After removing duplicates the original string is "+s2);
	}
}
