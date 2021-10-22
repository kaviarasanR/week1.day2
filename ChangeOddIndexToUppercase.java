package week1.day2;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String value = "changeme";

		char[] charArray = value.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			String value2 = value.toUpperCase();
			char[] charArray2 = value2.toCharArray();
			if (i % 2 == 0) {
				System.out.print(charArray2[i]);
			} else {
				System.out.print(charArray[i]);
			}
		}
	}

}
