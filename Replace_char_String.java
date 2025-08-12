package pack1;
import java.util.*;
public class Replace_char_String {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the string: ");
	        String input = sc.nextLine();
	        
	        // Input character to replace
	        System.out.print("Enter the character to replace: ");
	        char oldChar = sc.next().charAt(0);
	        // Input new character
	        System.out.print("Enter the new character: ");
	        char newChar = sc.next().charAt(0);
	        // Use StringBuilder for modification
	        StringBuilder sb = new StringBuilder(input);
	        // Loop and replace
	        for (int i = 0; i < sb.length(); i++) {
	            if (sb.charAt(i) == oldChar) {
	                sb.setCharAt(i, newChar);
	            }
	        }

	        // Output result
	        System.out.println("Modified string: " + sb.toString());
	    }
}