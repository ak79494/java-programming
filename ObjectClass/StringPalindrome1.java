import java.util.Scanner;
class StringPalindrome1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("Enter the String value rather to check palindrome or not");
		// check palindrome
		if(isPalindrome(input)) {
			System.out.println(input+" palindrome");
		}else{
			System.out.println(input+" not palindrome");
		}
	}
	public static boolean isPalindrome(String str) {
		int left = 0, right = str.length()-1;
		while(left<right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}