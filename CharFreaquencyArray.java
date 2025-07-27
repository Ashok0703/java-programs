package pack1;


import java.util.Scanner;

public class CharFreaquencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // Create frequency array for ASCII (0 to 255)
        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Display frequencies
        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.println("'" + (char) i + "' : " + freq[i]);
            }
        }
    }
}

