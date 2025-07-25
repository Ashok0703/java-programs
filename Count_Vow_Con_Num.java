package Countvowels;
import java.util.*;
public class Count_Vow_Con_Num {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s=sc.nextLine();
		int v=0,c=0,d=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isLetter(ch)) {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					v+=1;
				}
				else {
					c+=1;
				}
			}
			if(Character.isDigit(ch)) {
				d+=1;
			}
		}
		System.out.println("Number of vowels : "+v);
		System.out.println("Number of consonats : "+c);
		System.out.println("Number of digits : "+d);
	}

}
