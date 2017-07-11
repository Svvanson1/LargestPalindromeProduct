
public class Solution {

	public static void main(String[] args) {
		
		int biggestNum = 0;
		
		for(int i = 100; i <= 999; i++) {
			for(int j = 100; j <= 999; j++) {
				int sum = i * j;
				String myString = Integer.toString(sum);
				
				if(isPalindrome(myString)) {
					if(sum > biggestNum) {
						biggestNum = sum;
					}
				}
			}
		}
		
		System.out.println(biggestNum);

	}

	
	public static boolean isPalindrome(String input) {
		if (input.length() == 0 || input.length() == 1) { //Checks if input is zero or one letter word
			return true; //Return true if nothing or a one letter word is in the input
		}
		if (input.charAt(0) == input.charAt(input.length()-1)) { //Checks 
			return isPalindrome(input.substring(1, input.length()-1)); //Applies the method recursively on the input minus checked chars 
		}
		else {
			return false;
		}
	}
	
}
