package special;

public class Palindrome {
	public static void main(String[] args) {
		//declare the input string
		String s = "A man, a plan, a canal: Panama";
		String rev = "";
		System.out.println("The original string is: " + s);
		//Replace the characters other than the alphabets
		String replace = s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println("The replaced String is: " + replace);
		//convert the alphabet into lowercase
		String lowerCase = replace.toLowerCase();
		System.out.println("Lowercase converted String is: " + lowerCase);
		//iteration to check the string is palindrome or not using for loop
		for(int i=lowerCase.length()-1;i>=0;i--) {
			rev = rev + lowerCase.charAt(i);
			
		}
		System.out.println("The Reveresed Word is: " + rev);
		//using if condition check whether it is palindrome or not	
		if(rev.equalsIgnoreCase(replace)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		}
}
				
