package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "i am a software tester";
		String finalTest = " ";
		String[] data = test.split(" ");
		int lengthTest1 = data.length;
		for (int i = 0; i < lengthTest1; i++) {
			if (i % 2 != 0) {
				char[] charArray = data[i].toCharArray();
				String strrev = "";
				for (int j = charArray.length - 1; j >= 0; j--) {
					strrev = strrev + data[i].charAt(j);
				}
				data[i] = strrev;
			}
		}
		for (int k = 0; k < lengthTest1; k++) {
			finalTest = finalTest + " " + data[k];
		}
		System.out.println(finalTest);
	}

}
