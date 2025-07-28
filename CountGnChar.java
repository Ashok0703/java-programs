
//Count the occurrence of a given character in a string

package pack1;
import java.util.*;
public class CountGnChar {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		System.out.println("Enter the Character to count : ");
		int count=0;
		char ch=sc.next().charAt(0);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("Count of the Char "+ch+" is "+count);
	}

}
