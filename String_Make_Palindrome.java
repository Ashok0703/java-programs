package Basic_Realtme_applications;
import java.util.*;
public class String_Make_Palindrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.next();
		String str=s.toLowerCase();
		HashMap<Character,Integer> f=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			f.put(ch, f.getOrDefault(ch, 0)+1);
		}
		int oddcount=0;
		for(Map.Entry<Character, Integer> e:f.entrySet()) {
			if(e.getValue()%2!=0) {
				oddcount+=1;
			}
		}
		if(str.length()%2==0 && oddcount==0) {
			System.out.println(s+" is rearranged to form palindrome");
		}
		else if(str.length()%2!=0 && oddcount==1){
			System.out.println(s+" is rearranged to form palindrome");
		}
		else {
			System.out.println(s+" is not form palindrome");
		}
	}
}
