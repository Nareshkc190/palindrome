package project2;
import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:  ");
		try {
		String toScan = scanner.nextLine();
		System.out.println(isPalindrome(toScan));
		}catch(Exception e ) {
		System.out.println("error");
		}
	
	}

	
	public static boolean isPalindrome(String word1){
		char[] word = word1.toCharArray();
	    int int1 = 0;
	    int int2 = word.length - 1;
	    while (int2 > int1) {
	        if (word[int1] != word[int2]) {
	            return false;
	        }
	        int1++;
	        int2--;
	    }
	    return true;
	}
}