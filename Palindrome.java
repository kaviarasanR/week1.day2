package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		String str1 = "madam";
		String str2 = "";
		int length = str1.length();
		for (int i = length - 1; i >= 0; i--) {
			str2 = str2 + str1.charAt(i);

		}
		if (str1.equals(str2)) {
			System.out.println("the given string " + str1 + " is a palindrome");
		} else {
			System.out.println("the given strin" + str1 + "is not palindrome");

		}

	}

}
